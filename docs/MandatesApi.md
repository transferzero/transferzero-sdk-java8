# MandatesApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMandate**](MandatesApi.md#getMandate) | **GET** /mandates/{Mandate ID} | Fetch a single mandate


<a name="getMandate"></a>
# **getMandate**
> MandateResponse getMandate(mandateID).execute();

Fetch a single mandate

Finds and returns a Mandate created within the current calendar year, where the mandate is linked to a Recipient owned by the authenticated API key.  Returns 404 if the mandate is not owned by the API key or was not issued in the current calendar year — mandates are only valid for the year in which they were issued.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.MandatesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

MandatesApi apiInstance = new MandatesApi(apiClient);
UUID mandateID = new UUID(); // UUID | ID of the mandate.  Example: `/v1/mandates/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    MandateResponse result = apiInstance.getMandate(mandateID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        MandateResponse result = e.getResponseObject(MandateResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling MandatesApi#getMandate");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mandateID** | [**UUID**](.md)| ID of the mandate.  Example: &#x60;/v1/mandates/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**MandateResponse**](MandateResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

