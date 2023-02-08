# AccountValidationApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAccountValidations**](AccountValidationApi.md#postAccountValidations) | **POST** /account_validations | Validates the existence of a bank account or a mobile phone number


<a name="postAccountValidations"></a>
# **postAccountValidations**
> AccountValidationResponse postAccountValidations(accountValidationRequest)

Validates the existence of a bank account or a mobile phone number

Validates the existence of a bank account or mobile phone number and returns the associated customer name

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountValidationApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

AccountValidationApi apiInstance = new AccountValidationApi(apiClient);
AccountValidationRequest accountValidationRequest = {"bank_account":"12345678","bank_code":"050","country":"NG","currency":"NGN","method":"bank"}; // AccountValidationRequest | 
try {
    AccountValidationResponse result = apiInstance.postAccountValidations(accountValidationRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        AccountValidationResponse result = e.getResponseObject(AccountValidationResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountValidationApi#postAccountValidations");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountValidationRequest** | [**AccountValidationRequest**](AccountValidationRequest.md)|  |

### Return type

[**AccountValidationResponse**](AccountValidationResponse.md)

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

