/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.azureresource.ErrorException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestServiceImpl class.
 */
public final class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private AutoRestResourceFlatteningTestServiceService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        this(new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .build());
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestResourceFlatteningTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s (%s)",
                getClass().getPackage().getImplementationVersion(),
                "AutoRestResourceFlatteningTestService, 1.0.0");
    }

    private void initializeService() {
        service = restClient().retrofit().create(AutoRestResourceFlatteningTestServiceService.class);
    }

    /**
     * The interface defining all the services for AutoRestResourceFlatteningTestService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestResourceFlatteningTestServiceService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> putArray(@Body List<ResourceInner> resourceArray, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/array")
        Observable<Response<ResponseBody>> getArray(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> putDictionary(@Body Map<String, FlattenedProductInner> resourceDictionary, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/dictionary")
        Observable<Response<ResponseBody>> getDictionary(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> putResourceCollection(@Body ResourceCollectionInner resourceComplexObject, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azure/resource-flatten/resourcecollection")
        Observable<Response<ResponseBody>> getResourceCollection(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putArray() throws ErrorException, IOException {
        putArrayWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putArrayWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putArrayAsync() {
        return putArrayWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as an Array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync() {
        final List<ResourceInner> resourceArray = null;
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putArray(List<ResourceInner> resourceArray) throws ErrorException, IOException {
        putArrayWithServiceResponseAsync(resourceArray).toBlocking().single().getBody();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putArrayAsync(List<ResourceInner> resourceArray, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putArrayWithServiceResponseAsync(resourceArray), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putArrayAsync(List<ResourceInner> resourceArray) {
        return putArrayWithServiceResponseAsync(resourceArray).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putArrayWithServiceResponseAsync(List<ResourceInner> resourceArray) {
        Validator.validate(resourceArray);
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProductInner&gt; object if successful.
     */
    public List<FlattenedProductInner> getArray() throws ErrorException, IOException {
        return getArrayWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<FlattenedProductInner>> getArrayAsync(final ServiceCallback<List<FlattenedProductInner>> serviceCallback) {
        return ServiceCall.create(getArrayWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as an Array.
     *
     * @return the observable to the List&lt;FlattenedProductInner&gt; object
     */
    public Observable<List<FlattenedProductInner>> getArrayAsync() {
        return getArrayWithServiceResponseAsync().map(new Func1<ServiceResponse<List<FlattenedProductInner>>, List<FlattenedProductInner>>() {
            @Override
            public List<FlattenedProductInner> call(ServiceResponse<List<FlattenedProductInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get External Resource as an Array.
     *
     * @return the observable to the List&lt;FlattenedProductInner&gt; object
     */
    public Observable<ServiceResponse<List<FlattenedProductInner>>> getArrayWithServiceResponseAsync() {
        return service.getArray(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<FlattenedProductInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<FlattenedProductInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<FlattenedProductInner>> clientResponse = getArrayDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<FlattenedProductInner>> getArrayDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<List<FlattenedProductInner>, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<List<FlattenedProductInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putDictionary() throws ErrorException, IOException {
        putDictionaryWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putDictionaryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putDictionaryAsync() {
        return putDictionaryWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync() {
        final Map<String, FlattenedProductInner> resourceDictionary = null;
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putDictionary(Map<String, FlattenedProductInner> resourceDictionary) throws ErrorException, IOException {
        putDictionaryWithServiceResponseAsync(resourceDictionary).toBlocking().single().getBody();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putDictionaryWithServiceResponseAsync(resourceDictionary), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary) {
        return putDictionaryWithServiceResponseAsync(resourceDictionary).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putDictionaryWithServiceResponseAsync(Map<String, FlattenedProductInner> resourceDictionary) {
        Validator.validate(resourceDictionary);
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProductInner&gt; object if successful.
     */
    public Map<String, FlattenedProductInner> getDictionary() throws ErrorException, IOException {
        return getDictionaryWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Map<String, FlattenedProductInner>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProductInner>> serviceCallback) {
        return ServiceCall.create(getDictionaryWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the observable to the Map&lt;String, FlattenedProductInner&gt; object
     */
    public Observable<Map<String, FlattenedProductInner>> getDictionaryAsync() {
        return getDictionaryWithServiceResponseAsync().map(new Func1<ServiceResponse<Map<String, FlattenedProductInner>>, Map<String, FlattenedProductInner>>() {
            @Override
            public Map<String, FlattenedProductInner> call(ServiceResponse<Map<String, FlattenedProductInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @return the observable to the Map&lt;String, FlattenedProductInner&gt; object
     */
    public Observable<ServiceResponse<Map<String, FlattenedProductInner>>> getDictionaryWithServiceResponseAsync() {
        return service.getDictionary(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Map<String, FlattenedProductInner>>>>() {
                @Override
                public Observable<ServiceResponse<Map<String, FlattenedProductInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Map<String, FlattenedProductInner>> clientResponse = getDictionaryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Map<String, FlattenedProductInner>> getDictionaryDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Map<String, FlattenedProductInner>, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Map<String, FlattenedProductInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putResourceCollection() throws ErrorException, IOException {
        putResourceCollectionWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putResourceCollectionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putResourceCollectionAsync() {
        return putResourceCollectionWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync() {
        final ResourceCollectionInner resourceComplexObject = null;
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public void putResourceCollection(ResourceCollectionInner resourceComplexObject) throws ErrorException, IOException {
        putResourceCollectionWithServiceResponseAsync(resourceComplexObject).toBlocking().single().getBody();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putResourceCollectionWithServiceResponseAsync(resourceComplexObject), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject) {
        return putResourceCollectionWithServiceResponseAsync(resourceComplexObject).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putResourceCollectionWithServiceResponseAsync(ResourceCollectionInner resourceComplexObject) {
        Validator.validate(resourceComplexObject);
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollectionInner object if successful.
     */
    public ResourceCollectionInner getResourceCollection() throws ErrorException, IOException {
        return getResourceCollectionWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ResourceCollectionInner> getResourceCollectionAsync(final ServiceCallback<ResourceCollectionInner> serviceCallback) {
        return ServiceCall.create(getResourceCollectionWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the observable to the ResourceCollectionInner object
     */
    public Observable<ResourceCollectionInner> getResourceCollectionAsync() {
        return getResourceCollectionWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceCollectionInner>, ResourceCollectionInner>() {
            @Override
            public ResourceCollectionInner call(ServiceResponse<ResourceCollectionInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return the observable to the ResourceCollectionInner object
     */
    public Observable<ServiceResponse<ResourceCollectionInner>> getResourceCollectionWithServiceResponseAsync() {
        return service.getResourceCollection(this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceCollectionInner> clientResponse = getResourceCollectionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceCollectionInner> getResourceCollectionDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<ResourceCollectionInner, ErrorException>(this.mapperAdapter())
                .register(200, new TypeToken<ResourceCollectionInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
