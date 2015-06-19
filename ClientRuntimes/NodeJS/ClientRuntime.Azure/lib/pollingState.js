﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information. 

var util = require('util');
var msRest = require('ms-rest');
var LroStates = require('./constants').AzureAsyncOperationStates;

/**
 * @class
 * Initializes a new instance of the PollingState class.
 * @constructor
 * @param {object} [response] - The response object to extract long
 * running operation status.
 * 
 * @param {number} retryTimeout - The timeout in seconds to retry on
 * intermediate operation results.
 */
function PollingState(response, retryTimeout) {
  this._retryTimeout = retryTimeout;
  this.response = response.response;
  this.request = response.request;
  this.resource = response.body;

  switch (this.response.statusCode) {
    case 202:
      this.status = LroStates.InProgress;
      break;

    case 204:
    case 201:
    case 200:
      this.status = LroStates.Succeeded;
      break;

    default:
      this.status = LroStates.Failed;
      break;
  }
  
  if (response.body && response.body.properties && response.body.properties.provisioningState)
  {
    this.status = response.body.properties.provisioningState;
  }
}

/**
 * Gets timeout in milliseconds. 
 * @returns {number} timeout
 */
PollingState.prototype.getTimeout = function () {
  if (this._retryTimeout) {
    return this._retryTimeout * 1000;
  }
  if (this.response && this.response.headers['retry-after']) {
    return parseInt(this.response.headers['retry-after']) * 1000;
  }
  return 30 * 1000;
}

/**
 * Returns long running operation result.
 * @returns {object} HttpOperationResponse
 */
PollingState.prototype.getOperationResponse = function () {
  var result = new msRest.HttpOperationResponse();
  result.request = this.request;
  result.response = this.response;
  result.body = this.resource;
  return result;
}

/**
 * Returns an Error on operation failure.
 * @returns {object} Error
 */
PollingState.prototype.getCloudError = function (err) {
  var errMsg;
  if (err && err.message) {
    errMsg = err.message;  
  } else {
    errMsg = util.format('Long running operation failed with status \'%s\'.', this.status);
  }
  
  var error = new Error(errMsg);
  error.body = this.response.body;
  error.request = this.request;
  error.response = this.response;
  return error;
}

module.exports = PollingState;