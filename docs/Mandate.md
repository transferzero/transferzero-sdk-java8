

# Mandate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the mandate |  [optional]
**status** | [**MandateStatus**](MandateStatus.md) |  |  [optional]
**typeId** | **Integer** | Numeric beneficiary type identifier. Identifies whether the mandate was issued for a natural person, sole proprietor, partnership, company, etc. |  [optional]
**reference** | **String** | Human-readable reference assigned to the mandate at creation. |  [optional]
**signedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate transitioned to &#x60;signed&#x60;. &#x60;null&#x60; for mandates that are pending, notified, failed, or bypassed. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the mandate was last updated. |  [optional]



