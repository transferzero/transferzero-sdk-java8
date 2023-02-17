

# TransactionReq

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**Transaction**](Transaction.md) |  | 
**documents** | [**List&lt;Document&gt;**](Document.md) | AML documents related to this transaction request. &#x60;&#x60;&#x60;JSON \&quot;documents\&quot;: [   {     \&quot;id\&quot;: \&quot;b6648ba3-1c7b-4f59-8580-684899c84a07\&quot;   } ] &#x60;&#x60;&#x60; |  [optional]
**metadata** | [**Object**](.md) | Metadata of transaction request |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the transaction request was created |  [optional]
**state** | **String** | State of transaction request |  [optional]
**tradeId** | **Integer** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**result** | [**Transaction**](Transaction.md) |  |  [optional]


