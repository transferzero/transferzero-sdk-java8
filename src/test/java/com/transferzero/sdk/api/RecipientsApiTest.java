/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.transferzero.sdk.api;

import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.model.ProofOfPaymentListResponse;
import com.transferzero.sdk.model.RecipientListResponse;
import com.transferzero.sdk.model.RecipientRequest;
import com.transferzero.sdk.model.RecipientResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecipientsApi
 */
@Ignore
public class RecipientsApiTest {

    private final RecipientsApi api = new RecipientsApi();

    
    /**
     * Cancelling a recipient
     *
     * Cancels the payment to the recipient specified in the URL path.  Please note recipients where the &#x60;may_cancel&#x60; attribute is true will be cancelled immediately. If the &#x60;may_cancel&#x60; attribute is false you can still try to cancel the recipient, however it will only gets cancelled if we will receive a confirmation from our partner that the payment has failed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRecipientTest() throws ApiException {
        UUID recipientID = null;
        RecipientResponse response = api.deleteRecipient(recipientID);

        // TODO: test validations
    }
    
    /**
     * Getting a list of recipients with filtering
     *
     * Fetches details of all recipients.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecipientsTest() throws ApiException {
        Integer page = null;
        Integer per = null;
        String createdAtFrom = null;
        String createdAtTo = null;
        String amountFrom = null;
        String amountTo = null;
        List<String> state = null;
        List<String> currency = null;
        RecipientListResponse response = api.getRecipients()
                .page(page)
                .per(per)
                .createdAtFrom(createdAtFrom)
                .createdAtTo(createdAtTo)
                .amountFrom(amountFrom)
                .amountTo(amountTo)
                .state(state)
                .currency(currency)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Updating a recipient
     *
     * Updates the recipient specified in the URL path.  Please note that only recipients where the &#x60;editable&#x60; field is true can be modified. Once the recipient is modified any subsequent payout tries will be sent to the updated details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchRecipientTest() throws ApiException {
        UUID recipientID = null;
        RecipientRequest recipientRequest = null;
        RecipientResponse response = api.patchRecipient(recipientID, recipientRequest);

        // TODO: test validations
    }
    
    /**
     * Returns list of proof of payments
     *
     * Returns a list of uploaded proof of payment files for a transaction recipient
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void proofOfPaymentsTest() throws ApiException {
        UUID recipientID = null;
        ProofOfPaymentListResponse response = api.proofOfPayments(recipientID);

        // TODO: test validations
    }
    
}
