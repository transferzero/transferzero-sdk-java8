# BankAccountDetailsApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBankAccountDetails**](BankAccountDetailsApi.md#getBankAccountDetails) | **GET** /bank_account_details/{Currency} | Fetching bank account details


<a name="getBankAccountDetails"></a>
# **getBankAccountDetails**
> BankAccountDetailsResponse getBankAccountDetails(currency).execute();

Fetching bank account details

Returns single bank account details based on the currency

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.BankAccountDetailsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

BankAccountDetailsApi apiInstance = new BankAccountDetailsApi(apiClient);
String currency = "currency_example"; // String | Currency of the required bank account details.  Example: `/v1/bank_account_details/NGN`
try {
    BankAccountDetailsResponse result = apiInstance.getBankAccountDetails(currency)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        BankAccountDetailsResponse result = e.getResponseObject(BankAccountDetailsResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling BankAccountDetailsApi#getBankAccountDetails");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency of the required bank account details.  Example: &#x60;/v1/bank_account_details/NGN&#x60; |

### Return type

[**BankAccountDetailsResponse**](BankAccountDetailsResponse.md)

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

