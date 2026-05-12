

# Mandate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the mandate |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current state of the mandate.  - &#x60;pending&#x60; — created, awaiting signing flow - &#x60;notified&#x60; — recipient has been notified to sign - &#x60;signed&#x60; — recipient signed; mandate is active - &#x60;failed&#x60; — signing flow failed (e.g. AVS/CDV rejection) - &#x60;bypassed&#x60; — administratively bypassed for an inward AZA payment |  [optional]
**typeId** | **Integer** | Numeric beneficiary type identifier. Identifies whether the mandate was issued for a natural person, sole proprietor, partnership, company, etc. |  [optional]
**reference** | **String** | Human-readable reference assigned to the mandate at creation. |  [optional]
**signedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate transitioned to &#x60;signed&#x60;. &#x60;null&#x60; for mandates that are pending, notified, failed, or bypassed. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate was last updated. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
NOTIFIED | &quot;notified&quot;
SIGNED | &quot;signed&quot;
FAILED | &quot;failed&quot;
BYPASSED | &quot;bypassed&quot;



