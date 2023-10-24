# AccountDebitsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAccountsDebits**](AccountDebitsApi.md#postAccountsDebits) | **POST** /accounts/debits | Creating an account debit


<a name="postAccountsDebits"></a>
# **postAccountsDebits**
> DebitListResponse postAccountsDebits(debitRequestWrapper)

Creating an account debit

Creates a new account debit finding transaction through the internal balance  To successfully fund a transaction - - The currency needs to be the same as the input_currency on the transaction - The amount has to be the same as the input_amount on the transaction - The to_id is the id of the transaction - You need to have enough balance of the appropriate currency inside your wallet  Once the transaction is funded, we will immediately start trying to pay out the recipient(s).  It is also possible to create multiple account debits by supplying an array of debit objects 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountDebitsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountDebitsApi apiInstance = new AccountDebitsApi(apiClient);
DebitRequestWrapper debitRequestWrapper = {"debit":{"currency":"NGN","amount":"2000.0","to_id":"5f44026b-7904-4c30-87d6-f8972d790ded","to_type":"Transaction"}}; // DebitRequestWrapper | 
try {
    DebitListResponse result = apiInstance.postAccountsDebits(debitRequestWrapper);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DebitListResponse result = e.getResponseObject(DebitListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountDebitsApi#postAccountsDebits");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitRequestWrapper** | [**DebitRequestWrapper**](DebitRequestWrapper.md)|  |

### Return type

[**DebitListResponse**](DebitListResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```
### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

