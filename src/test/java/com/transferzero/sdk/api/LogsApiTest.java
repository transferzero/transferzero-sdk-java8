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
import java.util.UUID;
import com.transferzero.sdk.model.WebhookLogListResponse;
import com.transferzero.sdk.model.WebhookLogResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
@Ignore
public class LogsApiTest {

    private final LogsApi api = new LogsApi();

    
    /**
     * Fetch an individual webhook log
     *
     * Returns a single webhook log based on the webhook log ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookLogTest() throws ApiException {
        UUID webhookLogID = null;
        WebhookLogResponse response = api.getWebhookLog(webhookLogID);

        // TODO: test validations
    }
    
    /**
     * Fetch a list of webhook logs
     *
     * Returns a list of webhook logs. Response includes pagination.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookLogsTest() throws ApiException {
        Integer page = null;
        Integer per = null;
        String createdAtFrom = null;
        String createdAtTo = null;
        WebhookLogListResponse response = api.getWebhookLogs(page, per, createdAtFrom, createdAtTo);

        // TODO: test validations
    }
    
}