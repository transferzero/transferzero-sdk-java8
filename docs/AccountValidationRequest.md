

# AccountValidationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccount** | **String** | Account Number to query |  [optional]
**bankCode** | **String** | Bank Code to query - same codes are used as for creating the transactions |  [optional]
**phoneNumber** | **String** | Phone number to query |  [optional]
**mobileProvider** | [**PayoutMethodMobileProviderEnum**](PayoutMethodMobileProviderEnum.md) |  |  [optional]
**country** | [**CountryEnum**](#CountryEnum) | Country of account in 2-character alpha ISO 3166-2 country format | 
**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency the bank account is in | 
**method** | [**MethodEnum**](#MethodEnum) | The method of the payment. Currently bank and mobile are supported | 



## Enum: CountryEnum

Name | Value
---- | -----
NG | &quot;NG&quot;
GH | &quot;GH&quot;



## Enum: CurrencyEnum

Name | Value
---- | -----
NGN | &quot;NGN&quot;
GHS | &quot;GHS&quot;



## Enum: MethodEnum

Name | Value
---- | -----
BANK | &quot;bank&quot;
MOBILE | &quot;mobile&quot;



