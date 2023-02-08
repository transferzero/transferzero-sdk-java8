# OpenCorporatesSenderUpdateApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateSender**](OpenCorporatesSenderUpdateApi.md#updateSender) | **POST** /open_corporates/update_sender | Update Sender with data retrieved from Open Corporates


<a name="updateSender"></a>
# **updateSender**
> OpenCorporatesSenderUpdateResponse updateSender(openCorporatesSenderUpdateRequest)

Update Sender with data retrieved from Open Corporates

This endpoint searches for a company on Open Corporates API and updates the associated Sender fields with the search results

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.OpenCorporatesSenderUpdateApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

OpenCorporatesSenderUpdateApi apiInstance = new OpenCorporatesSenderUpdateApi(apiClient);
OpenCorporatesSenderUpdateRequest openCorporatesSenderUpdateRequest = new OpenCorporatesSenderUpdateRequest(); // OpenCorporatesSenderUpdateRequest | 
try {
    OpenCorporatesSenderUpdateResponse result = apiInstance.updateSender(openCorporatesSenderUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        OpenCorporatesSenderUpdateResponse result = e.getResponseObject(OpenCorporatesSenderUpdateResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling OpenCorporatesSenderUpdateApi#updateSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openCorporatesSenderUpdateRequest** | [**OpenCorporatesSenderUpdateRequest**](OpenCorporatesSenderUpdateRequest.md)|  |

### Return type

[**OpenCorporatesSenderUpdateResponse**](OpenCorporatesSenderUpdateResponse.md)

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

