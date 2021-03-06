/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Polymorphicrecursives;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Polymorphicrecursives.
 */
public final class PolymorphicrecursivesImpl implements Polymorphicrecursives {
    /** The Retrofit service to perform REST calls. */
    private PolymorphicrecursivesService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Polymorphicrecursives.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolymorphicrecursivesImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(PolymorphicrecursivesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Polymorphicrecursives to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolymorphicrecursivesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/polymorphicrecursive/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/polymorphicrecursive/valid")
        Observable<Response<ResponseBody>> putValid(@Body Fish complexBody);

    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Fish object if successful.
     */
    public Fish getValid() throws ErrorException, IOException {
        return getValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Fish> getValidAsync(final ServiceCallback<Fish> serviceCallback) {
        return ServiceCall.create(getValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @return the observable to the Fish object
     */
    public Observable<Fish> getValidAsync() {
        return getValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Fish>, Fish>() {
            @Override
            public Fish call(ServiceResponse<Fish> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @return the observable to the Fish object
     */
    public Observable<ServiceResponse<Fish>> getValidWithServiceResponseAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Fish>>>() {
                @Override
                public Observable<ServiceResponse<Fish>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Fish> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Fish> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Fish, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Fish>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public void putValid(Fish complexBody) throws ErrorException, IOException, IllegalArgumentException {
        putValidWithServiceResponseAsync(complexBody).toBlocking().single().getBody();
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putValidWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putValidAsync(Fish complexBody) {
        return putValidWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
     {
         "fishtype": "salmon",
         "species": "king",
         "length": 1,
         "age": 1,
         "location": "alaska",
         "iswild": true,
         "siblings": [
             {
                 "fishtype": "shark",
                 "species": "predator",
                 "length": 20,
                 "age": 6,
                 "siblings": [
                     {
                         "fishtype": "salmon",
                         "species": "coho",
                         "length": 2,
                         "age": 2,
                         "location": "atlantic",
                         "iswild": true,
                         "siblings": [
                             {
                                 "fishtype": "shark",
                                 "species": "predator",
                                 "length": 20,
                                 "age": 6
                             },
                             {
                                 "fishtype": "sawshark",
                                 "species": "dangerous",
                                 "length": 10,
                                 "age": 105
                             }
                         ]
                     },
                     {
                         "fishtype": "sawshark",
                         "species": "dangerous",
                         "length": 10,
                         "age": 105
                     }
                 ]
             },
             {
                 "fishtype": "sawshark",
                 "species": "dangerous",
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidWithServiceResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
