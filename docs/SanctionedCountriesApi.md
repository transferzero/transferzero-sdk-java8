# SanctionedCountriesApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSanctionedCountries**](SanctionedCountriesApi.md#getSanctionedCountries) | **GET** /sanctioned_countries | Get List of Sanctioned Countries


<a name="getSanctionedCountries"></a>
# **getSanctionedCountries**
> SanctionedCountryListResponse getSanctionedCountries().execute();

Get List of Sanctioned Countries

Get a list of sanctioned countries

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SanctionedCountriesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

SanctionedCountriesApi apiInstance = new SanctionedCountriesApi(apiClient);
try {
    SanctionedCountryListResponse result = apiInstance.getSanctionedCountries()
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SanctionedCountryListResponse result = e.getResponseObject(SanctionedCountryListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SanctionedCountriesApi#getSanctionedCountries");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SanctionedCountryListResponse**](SanctionedCountryListResponse.md)

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

