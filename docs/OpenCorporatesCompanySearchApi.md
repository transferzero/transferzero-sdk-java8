# OpenCorporatesCompanySearchApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCompany**](OpenCorporatesCompanySearchApi.md#searchCompany) | **POST** /open_corporates/search | Search for a company on Open Corporates


<a name="searchCompany"></a>
# **searchCompany**
> OpenCorporatesSearchResponse searchCompany(openCorporatesSearchRequest)

Search for a company on Open Corporates

This endpoint searches for a company on Open Corporates API and returns the name if found

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.OpenCorporatesCompanySearchApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

OpenCorporatesCompanySearchApi apiInstance = new OpenCorporatesCompanySearchApi(apiClient);
OpenCorporatesSearchRequest openCorporatesSearchRequest = new OpenCorporatesSearchRequest(); // OpenCorporatesSearchRequest | 
try {
    OpenCorporatesSearchResponse result = apiInstance.searchCompany(openCorporatesSearchRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        OpenCorporatesSearchResponse result = e.getResponseObject(OpenCorporatesSearchResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling OpenCorporatesCompanySearchApi#searchCompany");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openCorporatesSearchRequest** | [**OpenCorporatesSearchRequest**](OpenCorporatesSearchRequest.md)|  |

### Return type

[**OpenCorporatesSearchResponse**](OpenCorporatesSearchResponse.md)

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

