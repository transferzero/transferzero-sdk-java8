

# PayinMethodDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethod** | **String** | The payment method which the user will use to make the payments. Options are &#x60;bank&#x60;, &#x60;card&#x60; or you can leave empty to support both. |  [optional]
**redirectUrl** | **String** | This is where the user should be redirected back when the payment has been finished |  [optional]
**phoneNumber** | **String** | The phone number where the funds should be collected from | 
**sendInstructions** | **Boolean** | States whether to send out the instructions to the phone number on how to pay the funds or not. This shuold always be set to true, otherwise the sender might not receive a prompt for payment. |  [optional]



