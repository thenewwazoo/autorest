namespace Fixtures.SwaggerBatHttp.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class C
    {
        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "httpCode")]
        public string HttpCode { get; set; }

    }
}