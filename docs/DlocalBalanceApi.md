# DlocalBalanceApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](DlocalBalanceApi.md#getBalance) | **GET** /dlocal/balance | Get dlocal balances


<a name="getBalance"></a>
# **getBalance**
> DlocalBalanceResponse getBalance()

Get dlocal balances

This endpoint retrieves dlocal account balances

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DlocalBalanceApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

DlocalBalanceApi apiInstance = new DlocalBalanceApi(apiClient);
try {
    DlocalBalanceResponse result = apiInstance.getBalance();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DlocalBalanceResponse result = e.getResponseObject(DlocalBalanceResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling DlocalBalanceApi#getBalance");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DlocalBalanceResponse**](DlocalBalanceResponse.md)

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

