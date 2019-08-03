# CurrencyInfoApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoCurrencies**](CurrencyInfoApi.md#infoCurrencies) | **GET** /info/currencies | Getting a list of possible requested currencies
[**infoCurrenciesIn**](CurrencyInfoApi.md#infoCurrenciesIn) | **GET** /info/currencies/in | Getting a list of possible input currencies
[**infoCurrenciesOut**](CurrencyInfoApi.md#infoCurrenciesOut) | **GET** /info/currencies/out | Getting a list of possible output currencies


<a name="infoCurrencies"></a>
# **infoCurrencies**
> CurrencyListResponse infoCurrencies()

Getting a list of possible requested currencies

Fetches a list of currencies available to use in other API requests. Usually the 3-character alpha ISO 4217 currency code (eg. USD) is used as the identifier.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.CurrencyInfoApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

CurrencyInfoApi apiInstance = new CurrencyInfoApi(apiClient);
try {
    CurrencyListResponse result = apiInstance.infoCurrencies();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        CurrencyListResponse result = e.getResponseObject(CurrencyListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling CurrencyInfoApi#infoCurrencies");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyListResponse**](CurrencyListResponse.md)

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

<a name="infoCurrenciesIn"></a>
# **infoCurrenciesIn**
> CurrencyExchangeListResponse infoCurrenciesIn(senderId)

Getting a list of possible input currencies

Fetches a list of currencies available to use as the input currency in other API requests. Usually the 3-character alpha ISO 4217 currency code (eg. USD) is used as the identifier. Use this endpoint to determine the current exchange rate from a specific input currency to any output currency that&#39;s available. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.CurrencyInfoApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

CurrencyInfoApi apiInstance = new CurrencyInfoApi(apiClient);
UUID senderId = new UUID(); // UUID | Allows the scoping of the results by `sender_id` (optional).  Example: `/v1/info/currencies/in?sender_id=26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
try {
    CurrencyExchangeListResponse result = apiInstance.infoCurrenciesIn(senderId);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        CurrencyExchangeListResponse result = e.getResponseObject(CurrencyExchangeListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling CurrencyInfoApi#infoCurrenciesIn");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | [**UUID**](.md)| Allows the scoping of the results by &#x60;sender_id&#x60; (optional).  Example: &#x60;/v1/info/currencies/in?sender_id&#x3D;26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; | [optional]

### Return type

[**CurrencyExchangeListResponse**](CurrencyExchangeListResponse.md)

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

<a name="infoCurrenciesOut"></a>
# **infoCurrenciesOut**
> CurrencyExchangeListResponse infoCurrenciesOut(senderId)

Getting a list of possible output currencies

Fetches a list of currencies available to use as the output currency and their exchange rates against the available input currencies. Usually the 3-character alpha ISO 4217 currency code (eg. USD) is used as the identifier. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.CurrencyInfoApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

CurrencyInfoApi apiInstance = new CurrencyInfoApi(apiClient);
UUID senderId = new UUID(); // UUID | Allows the scoping of the results by `sender_id` (optional).  Example: `/v1/info/currencies/out?sender_id=26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
try {
    CurrencyExchangeListResponse result = apiInstance.infoCurrenciesOut(senderId);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        CurrencyExchangeListResponse result = e.getResponseObject(CurrencyExchangeListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling CurrencyInfoApi#infoCurrenciesOut");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | [**UUID**](.md)| Allows the scoping of the results by &#x60;sender_id&#x60; (optional).  Example: &#x60;/v1/info/currencies/out?sender_id&#x3D;26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; | [optional]

### Return type

[**CurrencyExchangeListResponse**](CurrencyExchangeListResponse.md)

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

