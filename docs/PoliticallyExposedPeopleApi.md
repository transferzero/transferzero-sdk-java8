# PoliticallyExposedPeopleApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePoliticallyExposedPerson**](PoliticallyExposedPeopleApi.md#deletePoliticallyExposedPerson) | **DELETE** /politically_exposed_people/{PoliticallyExposedPerson ID} | Deleting a politically exposed person
[**getPoliticallyExposedPeople**](PoliticallyExposedPeopleApi.md#getPoliticallyExposedPeople) | **GET** /politically_exposed_people | Listing Politically Exposed People
[**getPoliticallyExposedPerson**](PoliticallyExposedPeopleApi.md#getPoliticallyExposedPerson) | **GET** /politically_exposed_people/{PoliticallyExposedPerson ID} | Fetching a politically exposed person
[**patchPoliticallyExposedPerson**](PoliticallyExposedPeopleApi.md#patchPoliticallyExposedPerson) | **PATCH** /politically_exposed_people/{PoliticallyExposedPerson ID} | Updating a politically exposed person
[**postPoliticallyExposedPeople**](PoliticallyExposedPeopleApi.md#postPoliticallyExposedPeople) | **POST** /politically_exposed_people | Creating a politically exposed person


<a name="deletePoliticallyExposedPerson"></a>
# **deletePoliticallyExposedPerson**
> deletePoliticallyExposedPerson(politicallyExposedPersonID)

Deleting a politically exposed person

Deletes a single politically exposed person given the PEP ID.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PoliticallyExposedPeopleApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PoliticallyExposedPeopleApi apiInstance = new PoliticallyExposedPeopleApi(apiClient);
Integer politicallyExposedPersonID = 56; // Integer | The ID of the Politically Exposed Person you want to delete.  Example: `/v1/politically_exposed_people/1`
try {
    apiInstance.deletePoliticallyExposedPerson(politicallyExposedPersonID);
} catch (ApiException e) {
    if (e.isValidationError()) {
        
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PoliticallyExposedPeopleApi#deletePoliticallyExposedPerson");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **politicallyExposedPersonID** | **Integer**| The ID of the Politically Exposed Person you want to delete.  Example: &#x60;/v1/politically_exposed_people/1&#x60; |

### Return type

null (empty response body)

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
 - **Accept**: Not defined

<a name="getPoliticallyExposedPeople"></a>
# **getPoliticallyExposedPeople**
> PoliticallyExposedPersonListResponse getPoliticallyExposedPeople().senderId(senderId).execute();

Listing Politically Exposed People

Get a list of politically exposed people

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PoliticallyExposedPeopleApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PoliticallyExposedPeopleApi apiInstance = new PoliticallyExposedPeopleApi(apiClient);
UUID senderId = new UUID(); // UUID | The ID of the Sender to whom the politically exposed people are attached to.  Example: `/v1/politically_exposed_people?sender_id=344fb668-196d-43db-9d94-b34b7e6c7e0b`
try {
    PoliticallyExposedPersonListResponse result = apiInstance.getPoliticallyExposedPeople()
            .senderId(senderId)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PoliticallyExposedPersonListResponse result = e.getResponseObject(PoliticallyExposedPersonListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PoliticallyExposedPeopleApi#getPoliticallyExposedPeople");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | [**UUID**](.md)| The ID of the Sender to whom the politically exposed people are attached to.  Example: &#x60;/v1/politically_exposed_people?sender_id&#x3D;344fb668-196d-43db-9d94-b34b7e6c7e0b&#x60; | [optional]

### Return type

[**PoliticallyExposedPersonListResponse**](PoliticallyExposedPersonListResponse.md)

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

<a name="getPoliticallyExposedPerson"></a>
# **getPoliticallyExposedPerson**
> PoliticallyExposedPersonResponse getPoliticallyExposedPerson(politicallyExposedPersonID).senderId(senderId).execute();

Fetching a politically exposed person

Returns a single politically exposed person given the PEP ID. Can optionally be filtered using the sender_id query parameter.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PoliticallyExposedPeopleApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PoliticallyExposedPeopleApi apiInstance = new PoliticallyExposedPeopleApi(apiClient);
Integer politicallyExposedPersonID = 56; // Integer | The ID of the Politically Exposed Person you want to retrieve.  Example: `/v1/politically_exposed_people/1?sender_id=344fb668-196d-43db-9d94-b34b7e6c7e0b`
UUID senderId = new UUID(); // UUID | The ID of the Sender to whom the politically exposed person is attached to.
try {
    PoliticallyExposedPersonResponse result = apiInstance.getPoliticallyExposedPerson(politicallyExposedPersonID)
            .senderId(senderId)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PoliticallyExposedPersonResponse result = e.getResponseObject(PoliticallyExposedPersonResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PoliticallyExposedPeopleApi#getPoliticallyExposedPerson");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **politicallyExposedPersonID** | **Integer**| The ID of the Politically Exposed Person you want to retrieve.  Example: &#x60;/v1/politically_exposed_people/1?sender_id&#x3D;344fb668-196d-43db-9d94-b34b7e6c7e0b&#x60; |
 **senderId** | [**UUID**](.md)| The ID of the Sender to whom the politically exposed person is attached to. | [optional]

### Return type

[**PoliticallyExposedPersonResponse**](PoliticallyExposedPersonResponse.md)

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

<a name="patchPoliticallyExposedPerson"></a>
# **patchPoliticallyExposedPerson**
> PoliticallyExposedPersonResponse patchPoliticallyExposedPerson(politicallyExposedPersonID, politicallyExposedPerson)

Updating a politically exposed person

Updates a single politically exposed person given the PEP ID.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PoliticallyExposedPeopleApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PoliticallyExposedPeopleApi apiInstance = new PoliticallyExposedPeopleApi(apiClient);
Integer politicallyExposedPersonID = 56; // Integer | The ID of the Politically Exposed Person you want to update.  Example: `/v1/politically_exposed_people/1`
PoliticallyExposedPerson politicallyExposedPerson = new PoliticallyExposedPerson(); // PoliticallyExposedPerson | 
try {
    PoliticallyExposedPersonResponse result = apiInstance.patchPoliticallyExposedPerson(politicallyExposedPersonID, politicallyExposedPerson);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PoliticallyExposedPersonResponse result = e.getResponseObject(PoliticallyExposedPersonResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PoliticallyExposedPeopleApi#patchPoliticallyExposedPerson");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **politicallyExposedPersonID** | **Integer**| The ID of the Politically Exposed Person you want to update.  Example: &#x60;/v1/politically_exposed_people/1&#x60; |
 **politicallyExposedPerson** | [**PoliticallyExposedPerson**](PoliticallyExposedPerson.md)|  |

### Return type

[**PoliticallyExposedPersonResponse**](PoliticallyExposedPersonResponse.md)

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

<a name="postPoliticallyExposedPeople"></a>
# **postPoliticallyExposedPeople**
> PoliticallyExposedPersonResponse postPoliticallyExposedPeople(politicallyExposedPerson)

Creating a politically exposed person

Creates a new politically exposed person in our system. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PoliticallyExposedPeopleApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

PoliticallyExposedPeopleApi apiInstance = new PoliticallyExposedPeopleApi(apiClient);
PoliticallyExposedPerson politicallyExposedPerson = { 
  "politically_exposed_person": {
    "name": "Ronald Reagan",
    "position": "President of the United States",
    "started_date": "1981-01-20T00:00:00.000Z",
    "ended_date": "1989-01-20T00:00:00.000Z",
    "sender_id": "344fb668-196d-43db-9d94-b34b7e6c7e0b"
  }
}; // PoliticallyExposedPerson | 
try {
    PoliticallyExposedPersonResponse result = apiInstance.postPoliticallyExposedPeople(politicallyExposedPerson);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PoliticallyExposedPersonResponse result = e.getResponseObject(PoliticallyExposedPersonResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PoliticallyExposedPeopleApi#postPoliticallyExposedPeople");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **politicallyExposedPerson** | [**PoliticallyExposedPerson**](PoliticallyExposedPerson.md)|  |

### Return type

[**PoliticallyExposedPersonResponse**](PoliticallyExposedPersonResponse.md)

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

