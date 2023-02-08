# OpenCorporatesSupportedCountriesApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpenCorporatesSupportedCountries**](OpenCorporatesSupportedCountriesApi.md#getOpenCorporatesSupportedCountries) | **GET** /open_corporates/countries | Get List of Supported Countries from OpenCorporates


<a name="getOpenCorporatesSupportedCountries"></a>
# **getOpenCorporatesSupportedCountries**
> OpenCorporatesSupportedCountriesListResponse getOpenCorporatesSupportedCountries().execute();

Get List of Supported Countries from OpenCorporates

Get List of Supported Countries from OpenCorporates

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.OpenCorporatesSupportedCountriesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

OpenCorporatesSupportedCountriesApi apiInstance = new OpenCorporatesSupportedCountriesApi(apiClient);
try {
    OpenCorporatesSupportedCountriesListResponse result = apiInstance.getOpenCorporatesSupportedCountries()
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        OpenCorporatesSupportedCountriesListResponse result = e.getResponseObject(OpenCorporatesSupportedCountriesListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling OpenCorporatesSupportedCountriesApi#getOpenCorporatesSupportedCountries");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenCorporatesSupportedCountriesListResponse**](OpenCorporatesSupportedCountriesListResponse.md)

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

