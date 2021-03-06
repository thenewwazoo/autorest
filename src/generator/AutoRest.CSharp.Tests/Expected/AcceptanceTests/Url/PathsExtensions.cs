// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsUrl
{
    using System.Threading.Tasks;
   using Models;

    /// <summary>
    /// Extension methods for Paths.
    /// </summary>
    public static partial class PathsExtensions
    {
            /// <summary>
            /// Get true Boolean value on path
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetBooleanTrue(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetBooleanTrueAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get true Boolean value on path
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetBooleanTrueAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetBooleanTrueWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get false Boolean value on path
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetBooleanFalse(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetBooleanFalseAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get false Boolean value on path
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetBooleanFalseAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetBooleanFalseWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '1000000' integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetIntOneMillion(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetIntOneMillionAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '1000000' integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetIntOneMillionAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetIntOneMillionWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '-1000000' integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetIntNegativeOneMillion(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetIntNegativeOneMillionAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '-1000000' integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetIntNegativeOneMillionAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetIntNegativeOneMillionWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '10000000000' 64 bit integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetTenBillion(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetTenBillionAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '10000000000' 64 bit integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetTenBillionAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetTenBillionWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '-10000000000' 64 bit integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void GetNegativeTenBillion(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).GetNegativeTenBillionAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '-10000000000' 64 bit integer value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetNegativeTenBillionAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetNegativeTenBillionWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '1.034E+20' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void FloatScientificPositive(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).FloatScientificPositiveAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '1.034E+20' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task FloatScientificPositiveAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.FloatScientificPositiveWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '-1.034E-20' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void FloatScientificNegative(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).FloatScientificNegativeAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '-1.034E-20' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task FloatScientificNegativeAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.FloatScientificNegativeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '9999999.999' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void DoubleDecimalPositive(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DoubleDecimalPositiveAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '9999999.999' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DoubleDecimalPositiveAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DoubleDecimalPositiveWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '-9999999.999' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void DoubleDecimalNegative(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DoubleDecimalNegativeAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '-9999999.999' numeric value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DoubleDecimalNegativeAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DoubleDecimalNegativeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void StringUnicode(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).StringUnicodeAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task StringUnicodeAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.StringUnicodeWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get 'begin!*'();:@ &amp;=+$,/?#[]end
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void StringUrlEncoded(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).StringUrlEncodedAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get 'begin!*'();:@ &amp;=+$,/?#[]end
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task StringUrlEncodedAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.StringUrlEncodedWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void StringEmpty(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).StringEmptyAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get ''
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task StringEmptyAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.StringEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get null (should throw)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='stringPath'>
            /// null string value
            /// </param>
            public static void StringNull(this IPaths operations, string stringPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).StringNullAsync(stringPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null (should throw)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='stringPath'>
            /// null string value
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task StringNullAsync(this IPaths operations, string stringPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.StringNullWithHttpMessagesAsync(stringPath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get using uri with 'green color' in path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='enumPath'>
            /// send the value green. Possible values include: 'red color', 'green color',
            /// 'blue color'
            /// </param>
            public static void EnumValid(this IPaths operations, UriColor enumPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).EnumValidAsync(enumPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get using uri with 'green color' in path parameter
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='enumPath'>
            /// send the value green. Possible values include: 'red color', 'green color',
            /// 'blue color'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task EnumValidAsync(this IPaths operations, UriColor enumPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.EnumValidWithHttpMessagesAsync(enumPath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get null (should throw on the client before the request is sent on wire)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='enumPath'>
            /// send null should throw. Possible values include: 'red color', 'green
            /// color', 'blue color'
            /// </param>
            public static void EnumNull(this IPaths operations, UriColor enumPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).EnumNullAsync(enumPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null (should throw on the client before the request is sent on wire)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='enumPath'>
            /// send null should throw. Possible values include: 'red color', 'green
            /// color', 'blue color'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task EnumNullAsync(this IPaths operations, UriColor enumPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.EnumNullWithHttpMessagesAsync(enumPath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bytePath'>
            /// '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
            /// </param>
            public static void ByteMultiByte(this IPaths operations, byte[] bytePath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).ByteMultiByteAsync(bytePath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bytePath'>
            /// '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task ByteMultiByteAsync(this IPaths operations, byte[] bytePath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.ByteMultiByteWithHttpMessagesAsync(bytePath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '' as byte array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void ByteEmpty(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).ByteEmptyAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '' as byte array
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task ByteEmptyAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.ByteEmptyWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get null as byte array (should throw)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bytePath'>
            /// null as byte array (should throw)
            /// </param>
            public static void ByteNull(this IPaths operations, byte[] bytePath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).ByteNullAsync(bytePath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null as byte array (should throw)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='bytePath'>
            /// null as byte array (should throw)
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task ByteNullAsync(this IPaths operations, byte[] bytePath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.ByteNullWithHttpMessagesAsync(bytePath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '2012-01-01' as date
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void DateValid(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DateValidAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '2012-01-01' as date
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DateValidAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DateValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get null as date - this should throw or be unusable on the client side,
            /// depending on date representation
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datePath'>
            /// null as date (should throw)
            /// </param>
            public static void DateNull(this IPaths operations, System.DateTime datePath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DateNullAsync(datePath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null as date - this should throw or be unusable on the client side,
            /// depending on date representation
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='datePath'>
            /// null as date (should throw)
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DateNullAsync(this IPaths operations, System.DateTime datePath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DateNullWithHttpMessagesAsync(datePath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get '2012-01-01T01:01:01Z' as date-time
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void DateTimeValid(this IPaths operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DateTimeValidAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get '2012-01-01T01:01:01Z' as date-time
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DateTimeValidAsync(this IPaths operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DateTimeValidWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get null as date-time, should be disallowed or throw depending on
            /// representation of date-time
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dateTimePath'>
            /// null as date-time
            /// </param>
            public static void DateTimeNull(this IPaths operations, System.DateTime dateTimePath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).DateTimeNullAsync(dateTimePath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get null as date-time, should be disallowed or throw depending on
            /// representation of date-time
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='dateTimePath'>
            /// null as date-time
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task DateTimeNullAsync(this IPaths operations, System.DateTime dateTimePath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.DateTimeNullWithHttpMessagesAsync(dateTimePath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get 'lorem' encoded value as 'bG9yZW0' (base64url)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='base64UrlPath'>
            /// base64url encoded value
            /// </param>
            public static void Base64Url(this IPaths operations, byte[] base64UrlPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).Base64UrlAsync(base64UrlPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get 'lorem' encoded value as 'bG9yZW0' (base64url)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='base64UrlPath'>
            /// base64url encoded value
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task Base64UrlAsync(this IPaths operations, byte[] base64UrlPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.Base64UrlWithHttpMessagesAsync(base64UrlPath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' ,
            /// null, ''] using the csv-array format
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayPath'>
            /// an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' ,
            /// null, ''] using the csv-array format
            /// </param>
            public static void ArrayCsvInPath(this IPaths operations, System.Collections.Generic.IList<string> arrayPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).ArrayCsvInPathAsync(arrayPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' ,
            /// null, ''] using the csv-array format
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='arrayPath'>
            /// an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' ,
            /// null, ''] using the csv-array format
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task ArrayCsvInPathAsync(this IPaths operations, System.Collections.Generic.IList<string> arrayPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.ArrayCsvInPathWithHttpMessagesAsync(arrayPath, null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get the date 2016-04-13 encoded value as '1460505600' (Unix time)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unixTimeUrlPath'>
            /// Unix time encoded value
            /// </param>
            public static void UnixTimeUrl(this IPaths operations, System.DateTime unixTimeUrlPath)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IPaths)s).UnixTimeUrlAsync(unixTimeUrlPath), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get the date 2016-04-13 encoded value as '1460505600' (Unix time)
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='unixTimeUrlPath'>
            /// Unix time encoded value
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task UnixTimeUrlAsync(this IPaths operations, System.DateTime unixTimeUrlPath, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.UnixTimeUrlWithHttpMessagesAsync(unixTimeUrlPath, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
