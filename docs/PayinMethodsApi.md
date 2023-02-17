# PayinMethodsApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePayinMethod**](PayinMethodsApi.md#deletePayinMethod) | **DELETE** /payin_methods/{PayinMethod ID} | Deleting a payin method
[**getPayinMethod**](PayinMethodsApi.md#getPayinMethod) | **GET** /payin_methods/{PayinMethod ID} | Fetching a payin method
[**patchPayinMethod**](PayinMethodsApi.md#patchPayinMethod) | **PATCH** /payin_methods/{PayinMethod ID} | Updating a payin method
[**retryPayinMethod**](PayinMethodsApi.md#retryPayinMethod) | **POST** /payin_methods/{PayinMethod ID}/retry | Retries PayinMethod


<a name="deletePayinMethod"></a>
# **deletePayinMethod**
> PayinMethodResponse deletePayinMethod(payinMethodID)

Deleting a payin method

Initiates a cancellation request for the specified payin method

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayinMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PayinMethodsApi apiInstance = new PayinMethodsApi(apiClient);
UUID payinMethodID = new UUID(); // UUID | ID of the payin method to delete.  Example: `/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    PayinMethodResponse result = apiInstance.deletePayinMethod(payinMethodID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayinMethodResponse result = e.getResponseObject(PayinMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayinMethodsApi#deletePayinMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payinMethodID** | [**UUID**](.md)| ID of the payin method to delete.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**PayinMethodResponse**](PayinMethodResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayinMethod"></a>
# **getPayinMethod**
> PayinMethodResponse getPayinMethod(payinMethodID).execute();

Fetching a payin method

Show a payin method by id

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayinMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PayinMethodsApi apiInstance = new PayinMethodsApi(apiClient);
UUID payinMethodID = new UUID(); // UUID | ID of the payin method to get.  Example: `/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    PayinMethodResponse result = apiInstance.getPayinMethod(payinMethodID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayinMethodResponse result = e.getResponseObject(PayinMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayinMethodsApi#getPayinMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payinMethodID** | [**UUID**](.md)| ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**PayinMethodResponse**](PayinMethodResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchPayinMethod"></a>
# **patchPayinMethod**
> PayinMethodResponse patchPayinMethod(payinMethodID, payinMethod)

Updating a payin method

Updates a single payin method by the Payin Method ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayinMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PayinMethodsApi apiInstance = new PayinMethodsApi(apiClient);
UUID payinMethodID = new UUID(); // UUID | ID of the payin method to get.  Example: `/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
PayinMethod payinMethod = new PayinMethod(); // PayinMethod | 
try {
    PayinMethodResponse result = apiInstance.patchPayinMethod(payinMethodID, payinMethod);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayinMethodResponse result = e.getResponseObject(PayinMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayinMethodsApi#patchPayinMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payinMethodID** | [**UUID**](.md)| ID of the payin method to get.  Example: &#x60;/v1/payin_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **payinMethod** | [**PayinMethod**](PayinMethod.md)|  |

### Return type

[**PayinMethodResponse**](PayinMethodResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retryPayinMethod"></a>
# **retryPayinMethod**
> PayinMethodResponse retryPayinMethod(payinMethodID)

Retries PayinMethod

Retries the collection process for the payin method.  Please note only payin methods in &#x60;error&#x60; state can be retried.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayinMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PayinMethodsApi apiInstance = new PayinMethodsApi(apiClient);
UUID payinMethodID = new UUID(); // UUID | ID of the payin method whose collection process should be retried  Example: `/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry`
try {
    PayinMethodResponse result = apiInstance.retryPayinMethod(payinMethodID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayinMethodResponse result = e.getResponseObject(PayinMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayinMethodsApi#retryPayinMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payinMethodID** | [**UUID**](.md)| ID of the payin method whose collection process should be retried  Example: &#x60;/v1/payin_methods/9d4d7b73-a94c-4979-ab57-09074fd55d33/retry&#x60; |

### Return type

[**PayinMethodResponse**](PayinMethodResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

