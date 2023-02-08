# SenderDocumentsApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocumentSender**](SenderDocumentsApi.md#addDocumentSender) | **POST** /senders/{Sender ID}/documents/{Document ID}/add | Adding a document to a sender
[**getSenderDocument**](SenderDocumentsApi.md#getSenderDocument) | **GET** /senders/{Sender ID}/documents/{Document ID} | Fetching a document belonging to a sender
[**getSenderDocuments**](SenderDocumentsApi.md#getSenderDocuments) | **GET** /senders/{Sender ID}/documents | Getting a list of documents belonging to a sender
[**removeDocumentSender**](SenderDocumentsApi.md#removeDocumentSender) | **POST** /senders/{Sender ID}/documents/{Document ID}/remove | Removing a document from a sender


<a name="addDocumentSender"></a>
# **addDocumentSender**
> DocumentResponse addDocumentSender(senderID, documentID)

Adding a document to a sender

Adds a new document to a sender 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SenderDocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

SenderDocumentsApi apiInstance = new SenderDocumentsApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender to add the document.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add`
UUID documentID = new UUID(); // UUID | The ID of the document to be added to the sender.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add`
try {
    DocumentResponse result = apiInstance.addDocumentSender(senderID, documentID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SenderDocumentsApi#addDocumentSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender to add the document.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add&#x60; |
 **documentID** | [**UUID**](.md)| The ID of the document to be added to the sender.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/add&#x60; |

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

<a name="getSenderDocument"></a>
# **getSenderDocument**
> DocumentResponse getSenderDocument(senderID, documentID).execute();

Fetching a document belonging to a sender

Returns a single document belonging to a sender by the Document ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SenderDocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

SenderDocumentsApi apiInstance = new SenderDocumentsApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender who owns the requested document.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
UUID documentID = new UUID(); // UUID | ID of the document to get.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
try {
    DocumentResponse result = apiInstance.getSenderDocument(senderID, documentID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SenderDocumentsApi#getSenderDocument");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender who owns the requested document.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; |
 **documentID** | [**UUID**](.md)| ID of the document to get.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; |

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

<a name="getSenderDocuments"></a>
# **getSenderDocuments**
> DocumentListResponse getSenderDocuments(senderID).page(page).per(per).execute();

Getting a list of documents belonging to a sender

Fetches a list of documents belonging to a sender.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SenderDocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

SenderDocumentsApi apiInstance = new SenderDocumentsApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender who owns the requested documents.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents`
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
try {
    DocumentListResponse result = apiInstance.getSenderDocuments(senderID)
            .page(page)
            .per(per)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentListResponse result = e.getResponseObject(DocumentListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SenderDocumentsApi#getSenderDocuments");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender who owns the requested documents.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents&#x60; |
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

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

<a name="removeDocumentSender"></a>
# **removeDocumentSender**
> DocumentResponse removeDocumentSender(senderID, documentID)

Removing a document from a sender

Removes a document from a sender 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SenderDocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

SenderDocumentsApi apiInstance = new SenderDocumentsApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender with the document to remove.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/remove`
UUID documentID = new UUID(); // UUID | The ID of the document to be removed from the sender.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/remove`
try {
    DocumentResponse result = apiInstance.removeDocumentSender(senderID, documentID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SenderDocumentsApi#removeDocumentSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender with the document to remove.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/remove&#x60; |
 **documentID** | [**UUID**](.md)| The ID of the document to be removed from the sender.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670/documents/26ec8517-2f0d-48c0-b74f-0bccb9ab3a87/remove&#x60; |

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

