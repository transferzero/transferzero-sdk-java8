# TransactionRequestsApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocumentTransactionRequest**](TransactionRequestsApi.md#addDocumentTransactionRequest) | **POST** /transaction_requests/{Transaction Request ID}/add_document | Adding a document to a transaction request (deprecated)
[**cancelTransactionRequest**](TransactionRequestsApi.md#cancelTransactionRequest) | **POST** /transaction_requests/{Transaction Request ID}/cancel | Cancelling a transaction request
[**confirmTransactionRequest**](TransactionRequestsApi.md#confirmTransactionRequest) | **POST** /transaction_requests/{Transaction Request ID}/confirm | Confirming a transaction request
[**getTransactionRequest**](TransactionRequestsApi.md#getTransactionRequest) | **GET** /transaction_requests/{Transaction Request ID} | Fetching a transaction request
[**getTransactionRequests**](TransactionRequestsApi.md#getTransactionRequests) | **GET** /transaction_requests | Listing transaction requests
[**postTransactionRequest**](TransactionRequestsApi.md#postTransactionRequest) | **POST** /transaction_requests | Creating a transaction request
[**restfulAddDocumentTransactionRequest**](TransactionRequestsApi.md#restfulAddDocumentTransactionRequest) | **POST** /transaction_requests/{Transaction Request ID}/documents/{Document ID}/add | Adding a document to a transaction request
[**transactionRequestLimits**](TransactionRequestsApi.md#transactionRequestLimits) | **GET** /transaction_requests/limits | Specifies the limits for transaction requests
[**validateTransactionRequests**](TransactionRequestsApi.md#validateTransactionRequests) | **POST** /transaction_requests/validate | Validates a transaction request payload


<a name="addDocumentTransactionRequest"></a>
# **addDocumentTransactionRequest**
> DocumentResponse addDocumentTransactionRequest(transactionRequestID, documentId)

Adding a document to a transaction request (deprecated)

Adds a new document to a transaction request 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
UUID transactionRequestID = new UUID(); // UUID | ID of the transaction request to add the document.  Example: `/v1/info/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/add_document?document_id=26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
UUID documentId = new UUID(); // UUID | The ID of the document to be added to the transaction request.  Example: `/v1/info/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/add_document?document_id=26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
try {
    DocumentResponse result = apiInstance.addDocumentTransactionRequest(transactionRequestID, documentId);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#addDocumentTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequestID** | [**UUID**](.md)| ID of the transaction request to add the document.  Example: &#x60;/v1/info/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/add_document?document_id&#x3D;26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; |
 **documentId** | [**UUID**](.md)| The ID of the document to be added to the transaction request.  Example: &#x60;/v1/info/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/add_document?document_id&#x3D;26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; |

### Return type

[**DocumentResponse**](DocumentResponse.md)

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

<a name="cancelTransactionRequest"></a>
# **cancelTransactionRequest**
> TransactionReqResponse cancelTransactionRequest(transactionRequestID, reasonCancellation)

Cancelling a transaction request

Cancels a transaction request 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
UUID transactionRequestID = new UUID(); // UUID | ID of the transaction request to cancel.  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/cancel`
String reasonCancellation = "reasonCancellation_example"; // String | Reason for the transaction request to cancel.  Example: `Not enough funds`
try {
    TransactionReqResponse result = apiInstance.cancelTransactionRequest(transactionRequestID, reasonCancellation);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqResponse result = e.getResponseObject(TransactionReqResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#cancelTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequestID** | [**UUID**](.md)| ID of the transaction request to cancel.  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/cancel&#x60; |
 **reasonCancellation** | **String**| Reason for the transaction request to cancel.  Example: &#x60;Not enough funds&#x60; |

### Return type

[**TransactionReqResponse**](TransactionReqResponse.md)

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

<a name="confirmTransactionRequest"></a>
# **confirmTransactionRequest**
> TransactionReqResponse confirmTransactionRequest(transactionRequestID)

Confirming a transaction request

Confirms a new transaction request 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
UUID transactionRequestID = new UUID(); // UUID | ID of the transaction request to confirm.  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/confirm`
try {
    TransactionReqResponse result = apiInstance.confirmTransactionRequest(transactionRequestID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqResponse result = e.getResponseObject(TransactionReqResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#confirmTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequestID** | [**UUID**](.md)| ID of the transaction request to confirm.  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/confirm&#x60; |

### Return type

[**TransactionReqResponse**](TransactionReqResponse.md)

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

<a name="getTransactionRequest"></a>
# **getTransactionRequest**
> TransactionReqResponse getTransactionRequest(transactionRequestID).versioned(versioned).execute();

Fetching a transaction request

Returns a single transaction request by the Transaction Request ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
UUID transactionRequestID = new UUID(); // UUID | ID of the transaction request to get.  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670`
Boolean versioned = true; // Boolean | If false is passed, returns a Transaction request containing a not cached Transaction object  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670?versioned=false`
try {
    TransactionReqResponse result = apiInstance.getTransactionRequest(transactionRequestID)
            .versioned(versioned)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqResponse result = e.getResponseObject(TransactionReqResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#getTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequestID** | [**UUID**](.md)| ID of the transaction request to get.  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **versioned** | **Boolean**| If false is passed, returns a Transaction request containing a not cached Transaction object  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670?versioned&#x3D;false&#x60; | [optional]

### Return type

[**TransactionReqResponse**](TransactionReqResponse.md)

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

<a name="getTransactionRequests"></a>
# **getTransactionRequests**
> TransactionReqListResponse getTransactionRequests().page(page).per(per).state(state).currency(currency).createdAtFrom(createdAtFrom).createdAtTo(createdAtTo).amountFrom(amountFrom).amountTo(amountTo).senderId(senderId).versioned(versioned).tag(tag).ids(ids).included(included).excluded(excluded).execute();

Listing transaction requests

Get a list of transaction requests

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
List<String> state = Arrays.asList(); // List<String> | Returns transaction requests with specified states.  Example: `/v1/transaction_requests?state[]=pending&state[]=modified`
List<String> currency = Arrays.asList(); // List<String> | Returns transaction requests with specified input_currency.  Example: `/v1/transaction_requests?currency[]=USD`
String createdAtFrom = "createdAtFrom_example"; // String | Returns transaction requests with specified created_at lower limit.  Example: `/v1/transaction_requests?created_at_from=2018-06-09`
String createdAtTo = "createdAtTo_example"; // String | Returns transaction requests with specified created_at upper limit.  Example: `/v1/transaction_requests?created_at_to=2018-06-08`
String amountFrom = "amountFrom_example"; // String | Returns transaction requests with specified amount lower limit.  Example: `/v1/transaction_requests?currency=NGN&amount_from=2.4319983`
String amountTo = "amountTo_example"; // String | Returns transaction requests with specified amount upper limit.  Example: `/v1/transaction_requests?currency=NGN&amount_to=2.4319985`
String senderId = "senderId_example"; // String | Returns transaction requests for the specified sender.  Example: `/v1/transaction_requests?sender_id=b41d3cb7-6c54-4245-85fc-8e30690eb0f7`
Boolean versioned = true; // Boolean | If false is passed, returns Transaction requests containing not cached Transaction objects  Example: `/v1/transaction_requests?versioned=false`
List<String> tag = Arrays.asList(); // List<String> | Returns transaction requests with the specified tag(s). Tags are optional labels assigned to transaction requests for organizational purposes  Example: `/v1/transaction_requests?tag[]=square`
List<String> ids = Arrays.asList(); // List<String> | Returns transaction requests with the specified id(s). This allows the fetching of multiple transaction requests by ids for efficiency  Example: `/v1/transaction_requests?ids[]=b41d3cb7-6c54-4245-85fc-8e30690eb0f7`
List<String> included = Arrays.asList(); // List<String> | Returns transaction requests with the specified payout currencies.  Example: `/v1/transaction_requests?included[]=KES`
List<String> excluded = Arrays.asList(); // List<String> | Returns transaction requests without the specified payout currencies.  Example: `/v1/transaction_requests?excluded[]=KES`
try {
    TransactionReqListResponse result = apiInstance.getTransactionRequests()
            .page(page)
            .per(per)
            .state(state)
            .currency(currency)
            .createdAtFrom(createdAtFrom)
            .createdAtTo(createdAtTo)
            .amountFrom(amountFrom)
            .amountTo(amountTo)
            .senderId(senderId)
            .versioned(versioned)
            .tag(tag)
            .ids(ids)
            .included(included)
            .excluded(excluded)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqListResponse result = e.getResponseObject(TransactionReqListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#getTransactionRequests");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Returns transaction requests with specified states.  Example: &#x60;/v1/transaction_requests?state[]&#x3D;pending&amp;state[]&#x3D;modified&#x60; | [optional]
 **currency** | [**List&lt;String&gt;**](String.md)| Returns transaction requests with specified input_currency.  Example: &#x60;/v1/transaction_requests?currency[]&#x3D;USD&#x60; | [optional]
 **createdAtFrom** | **String**| Returns transaction requests with specified created_at lower limit.  Example: &#x60;/v1/transaction_requests?created_at_from&#x3D;2018-06-09&#x60; | [optional]
 **createdAtTo** | **String**| Returns transaction requests with specified created_at upper limit.  Example: &#x60;/v1/transaction_requests?created_at_to&#x3D;2018-06-08&#x60; | [optional]
 **amountFrom** | **String**| Returns transaction requests with specified amount lower limit.  Example: &#x60;/v1/transaction_requests?currency&#x3D;NGN&amp;amount_from&#x3D;2.4319983&#x60; | [optional]
 **amountTo** | **String**| Returns transaction requests with specified amount upper limit.  Example: &#x60;/v1/transaction_requests?currency&#x3D;NGN&amp;amount_to&#x3D;2.4319985&#x60; | [optional]
 **senderId** | **String**| Returns transaction requests for the specified sender.  Example: &#x60;/v1/transaction_requests?sender_id&#x3D;b41d3cb7-6c54-4245-85fc-8e30690eb0f7&#x60; | [optional]
 **versioned** | **Boolean**| If false is passed, returns Transaction requests containing not cached Transaction objects  Example: &#x60;/v1/transaction_requests?versioned&#x3D;false&#x60; | [optional]
 **tag** | [**List&lt;String&gt;**](String.md)| Returns transaction requests with the specified tag(s). Tags are optional labels assigned to transaction requests for organizational purposes  Example: &#x60;/v1/transaction_requests?tag[]&#x3D;square&#x60; | [optional]
 **ids** | [**List&lt;String&gt;**](String.md)| Returns transaction requests with the specified id(s). This allows the fetching of multiple transaction requests by ids for efficiency  Example: &#x60;/v1/transaction_requests?ids[]&#x3D;b41d3cb7-6c54-4245-85fc-8e30690eb0f7&#x60; | [optional]
 **included** | [**List&lt;String&gt;**](String.md)| Returns transaction requests with the specified payout currencies.  Example: &#x60;/v1/transaction_requests?included[]&#x3D;KES&#x60; | [optional]
 **excluded** | [**List&lt;String&gt;**](String.md)| Returns transaction requests without the specified payout currencies.  Example: &#x60;/v1/transaction_requests?excluded[]&#x3D;KES&#x60; | [optional]

### Return type

[**TransactionReqListResponse**](TransactionReqListResponse.md)

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

<a name="postTransactionRequest"></a>
# **postTransactionRequest**
> TransactionReqResponse postTransactionRequest(transactionReqRequest)

Creating a transaction request

Creates a new transaction request 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
TransactionReqRequest transactionReqRequest = new TransactionReqRequest(); // TransactionReqRequest | 
try {
    TransactionReqResponse result = apiInstance.postTransactionRequest(transactionReqRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqResponse result = e.getResponseObject(TransactionReqResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#postTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionReqRequest** | [**TransactionReqRequest**](TransactionReqRequest.md)|  |

### Return type

[**TransactionReqResponse**](TransactionReqResponse.md)

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

<a name="restfulAddDocumentTransactionRequest"></a>
# **restfulAddDocumentTransactionRequest**
> DocumentResponse restfulAddDocumentTransactionRequest(transactionRequestID, documentID)

Adding a document to a transaction request

Adds a new document to a transaction request 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
UUID transactionRequestID = new UUID(); // UUID | ID of the transaction request to add the document.  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add`
UUID documentID = new UUID(); // UUID | The ID of the document to be added to the transaction request.  Example: `/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add`
try {
    DocumentResponse result = apiInstance.restfulAddDocumentTransactionRequest(transactionRequestID, documentID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#restfulAddDocumentTransactionRequest");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequestID** | [**UUID**](.md)| ID of the transaction request to add the document.  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add&#x60; |
 **documentID** | [**UUID**](.md)| The ID of the document to be added to the transaction request.  Example: &#x60;/v1/transaction_requests/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add&#x60; |

### Return type

[**DocumentResponse**](DocumentResponse.md)

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

<a name="transactionRequestLimits"></a>
# **transactionRequestLimits**
> TransactionReqLimitsResponse transactionRequestLimits()

Specifies the limits for transaction requests

Specifies the minimum and maximum limits for transaction requests

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
try {
    TransactionReqLimitsResponse result = apiInstance.transactionRequestLimits();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqLimitsResponse result = e.getResponseObject(TransactionReqLimitsResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#transactionRequestLimits");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TransactionReqLimitsResponse**](TransactionReqLimitsResponse.md)

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

<a name="validateTransactionRequests"></a>
# **validateTransactionRequests**
> TransactionReqResponse validateTransactionRequests(transactionReqRequest)

Validates a transaction request payload

Validates fields in a transaction request payload and displays invalid or missing fields

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.TransactionRequestsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

TransactionRequestsApi apiInstance = new TransactionRequestsApi(apiClient);
TransactionReqRequest transactionReqRequest = new TransactionReqRequest(); // TransactionReqRequest | 
try {
    TransactionReqResponse result = apiInstance.validateTransactionRequests(transactionReqRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        TransactionReqResponse result = e.getResponseObject(TransactionReqResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling TransactionRequestsApi#validateTransactionRequests");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionReqRequest** | [**TransactionReqRequest**](TransactionReqRequest.md)|  |

### Return type

[**TransactionReqResponse**](TransactionReqResponse.md)

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

