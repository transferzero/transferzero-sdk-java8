

# Debit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Double** | The amount to be debited from your account.  The \&quot;amount\&quot; parameter is optional - - if included, it must equal the amount required to fund the transaction. - if omitted, it will default to the amount required to fund the transaction.  |  [optional]
**currency** | **String** | The currency of the amount in 3-character alpha ISO 4217 currency format.  The \&quot;currency\&quot; parameter is optional - if omitted, it will default to the payin currency of the transaction. - it can be added in as an additional check to ensure that the expected currency is used. (an error will be given back if it does not match up with the payin currency of the transaction)  |  [optional]
**toType** | **String** | Describes what the debit is funding | 
**toId** | [**UUID**](UUID.md) | The ID of the resource the debit is funding | 
**metadata** | [**Object**](.md) | Metadata of account debit |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time that the debit was created |  [optional]
**usdAmount** | **Double** | The amount to be debited from your account converted to USD  |  [optional]
**runningBalance** | **Double** | The total amount remaining in your account after the debit call  |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]



