

# AccountValidationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccount** | **String** | Account Number to query |  [optional]
**bankCode** | **String** | Bank Code to query - same codes are used as for creating the transactions |  [optional]
**iban** | **String** | IBAN to query - BBAN format for XOF bank accounts |  [optional]
**phoneNumber** | **String** | Phone number to query in E.164 format |  [optional]
**mobileProvider** | [**PayoutMethodMobileProviderEnum**](PayoutMethodMobileProviderEnum.md) |  |  [optional]
**country** | [**CountryEnum**](#CountryEnum) | Country of account in 2-character alpha ISO 3166-2 country format | 
**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency the bank account is in | 
**method** | [**MethodEnum**](#MethodEnum) | The method of the payment. Currently bank and mobile are supported | 



## Enum: CountryEnum

Name | Value
---- | -----
BF | &quot;BF&quot;
BJ | &quot;BJ&quot;
CG | &quot;CG&quot;
CI | &quot;CI&quot;
CM | &quot;CM&quot;
GA | &quot;GA&quot;
GH | &quot;GH&quot;
KE | &quot;KE&quot;
NG | &quot;NG&quot;
SN | &quot;SN&quot;
TD | &quot;TD&quot;
TG | &quot;TG&quot;
UG | &quot;UG&quot;



## Enum: CurrencyEnum

Name | Value
---- | -----
NGN | &quot;NGN&quot;
GHS | &quot;GHS&quot;
KES | &quot;KES&quot;
XOF | &quot;XOF&quot;
UGX | &quot;UGX&quot;
XAF | &quot;XAF&quot;



## Enum: MethodEnum

Name | Value
---- | -----
BANK | &quot;bank&quot;
MOBILE | &quot;mobile&quot;



