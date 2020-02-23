

# Document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upload** | **String** | Base64 encoded data uri of an image/pdf file or a fully qualified url | 
**uploadFileName** | **String** | Name of the upload | 
**metadata** | [**Object**](.md) | Metadata of document |  [optional]
**uploadContentType** | **String** |  |  [optional]
**uploadFileSize** | **Integer** |  |  [optional]
**category** | **String** | uncategorised |  [optional]
**side** | [**SideEnum**](#SideEnum) | The side of the KYC ID. One of &#39;front&#39; or &#39;back&#39; |  [optional]
**documentType** | **String** | This is a brief description of the document type |  [optional]
**issuingCountry** | **String** | Issuing country of ID in 2-character alpha ISO 3166-2 country format |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**state** | **String** | The state of the document. Can be one of the following:  - &#x60;initial&#x60;: When a document is created and has not been through any checks (the default state) - &#x60;verified&#x60;: A document has passed compliance checks - &#x60;rejected&#x60;: The document has failed compliance checks |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
FRONT | &quot;front&quot;
BACK | &quot;back&quot;



