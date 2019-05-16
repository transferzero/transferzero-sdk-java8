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

import com.transferzero.sdk.ApiCallback;
import com.transferzero.sdk.ApiClient;
import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.ApiResponse;
import com.transferzero.sdk.Configuration;
import com.transferzero.sdk.Pair;
import com.transferzero.sdk.ProgressRequestBody;
import com.transferzero.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.util.UUID;
import com.transferzero.sdk.model.WebhookLogListResponse;
import com.transferzero.sdk.model.WebhookLogResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogsApi {
    private ApiClient localVarApiClient;

    public LogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getWebhookLog
     * @param webhookLogID ID of the webhook log to retrieve  Example: &#x60;/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df&#x60; (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getWebhookLogCall(UUID webhookLogID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/logs/{Webhook Log ID}"
            .replaceAll("\\{" + "Webhook Log ID" + "\\}", localVarApiClient.escapeString(webhookLogID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWebhookLogValidateBeforeCall(UUID webhookLogID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'webhookLogID' is set
        if (webhookLogID == null) {
            throw new ApiException("Missing the required parameter 'webhookLogID' when calling getWebhookLog(Async)");
        }
        

        okhttp3.Call localVarCall = getWebhookLogCall(webhookLogID, _callback);
        return localVarCall;

    }

    /**
     * Fetch an individual webhook log
     * Returns a single webhook log based on the webhook log ID.
     * @param webhookLogID ID of the webhook log to retrieve  Example: &#x60;/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df&#x60; (required)
     * @return WebhookLogResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookLogResponse getWebhookLog(UUID webhookLogID) throws ApiException {
        ApiResponse<WebhookLogResponse> localVarResp = getWebhookLogWithHttpInfo(webhookLogID);
        return localVarResp.getData();
    }

    /**
     * Fetch an individual webhook log
     * Returns a single webhook log based on the webhook log ID.
     * @param webhookLogID ID of the webhook log to retrieve  Example: &#x60;/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df&#x60; (required)
     * @return ApiResponse&lt;WebhookLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookLogResponse> getWebhookLogWithHttpInfo(UUID webhookLogID) throws ApiException {
        okhttp3.Call localVarCall = getWebhookLogValidateBeforeCall(webhookLogID, null);
        Type localVarReturnType = new TypeToken<WebhookLogResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch an individual webhook log (asynchronously)
     * Returns a single webhook log based on the webhook log ID.
     * @param webhookLogID ID of the webhook log to retrieve  Example: &#x60;/v1/logs/9d1ad631-f34a-4cff-9a7e-2c83e3a556df&#x60; (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getWebhookLogAsync(UUID webhookLogID, final ApiCallback<WebhookLogResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebhookLogValidateBeforeCall(webhookLogID, _callback);
        Type localVarReturnType = new TypeToken<WebhookLogResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWebhookLogs
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getWebhookLogsCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/logs/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (per != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per", per));
        }

        if (createdAtFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at_from", createdAtFrom));
        }

        if (createdAtTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at_to", createdAtTo));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWebhookLogsValidateBeforeCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getWebhookLogsCall(page, per, createdAtFrom, createdAtTo, _callback);
        return localVarCall;

    }

    /**
     * Fetch a list of webhook logs
     * Returns a list of webhook logs. Response includes pagination.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return WebhookLogListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookLogListResponse getWebhookLogs(Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        ApiResponse<WebhookLogListResponse> localVarResp = getWebhookLogsWithHttpInfo(page, per, createdAtFrom, createdAtTo);
        return localVarResp.getData();
    }

    /**
     * Fetch a list of webhook logs
     * Returns a list of webhook logs. Response includes pagination.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return ApiResponse&lt;WebhookLogListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookLogListResponse> getWebhookLogsWithHttpInfo(Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        okhttp3.Call localVarCall = getWebhookLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, null);
        Type localVarReturnType = new TypeToken<WebhookLogListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch a list of webhook logs (asynchronously)
     * Returns a list of webhook logs. Response includes pagination.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getWebhookLogsAsync(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback<WebhookLogListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebhookLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, _callback);
        Type localVarReturnType = new TypeToken<WebhookLogListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
