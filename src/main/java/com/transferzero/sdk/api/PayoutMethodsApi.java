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


import com.transferzero.sdk.model.PayoutMethod;
import com.transferzero.sdk.model.PayoutMethodListResponse;
import com.transferzero.sdk.model.PayoutMethodRequest;
import com.transferzero.sdk.model.PayoutMethodResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoutMethodsApi {
    private ApiClient localVarApiClient;

    public PayoutMethodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayoutMethodsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deletePayoutMethod
     * @param payoutMethodID ID of the payout method to delete.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deletePayoutMethodCall(UUID payoutMethodID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payout_methods/{Payout Method ID}"
            .replaceAll("\\{" + "Payout Method ID" + "\\}", localVarApiClient.escapeString(payoutMethodID.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePayoutMethodValidateBeforeCall(UUID payoutMethodID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payoutMethodID' is set
        if (payoutMethodID == null) {
            throw new ApiException("Missing the required parameter 'payoutMethodID' when calling deletePayoutMethod(Async)");
        }
        

        okhttp3.Call localVarCall = deletePayoutMethodCall(payoutMethodID, _callback);
        return localVarCall;

    }

    /**
     * Deleting a payout method
     * Deletes a single payout method by the Payout Method ID
     * @param payoutMethodID ID of the payout method to delete.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return PayoutMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayoutMethodResponse deletePayoutMethod(UUID payoutMethodID) throws ApiException {
        ApiResponse<PayoutMethodResponse> localVarResp = deletePayoutMethodWithHttpInfo(payoutMethodID);
        return localVarResp.getData();
    }

    /**
     * Deleting a payout method
     * Deletes a single payout method by the Payout Method ID
     * @param payoutMethodID ID of the payout method to delete.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return ApiResponse&lt;PayoutMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayoutMethodResponse> deletePayoutMethodWithHttpInfo(UUID payoutMethodID) throws ApiException {
        okhttp3.Call localVarCall = deletePayoutMethodValidateBeforeCall(payoutMethodID, null);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deleting a payout method (asynchronously)
     * Deletes a single payout method by the Payout Method ID
     * @param payoutMethodID ID of the payout method to delete.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deletePayoutMethodAsync(UUID payoutMethodID, final ApiCallback<PayoutMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePayoutMethodValidateBeforeCall(payoutMethodID, _callback);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPayoutMethod
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getPayoutMethodCall(UUID payoutMethodID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payout_methods/{Payout Method ID}"
            .replaceAll("\\{" + "Payout Method ID" + "\\}", localVarApiClient.escapeString(payoutMethodID.toString()));

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
    private okhttp3.Call getPayoutMethodValidateBeforeCall(UUID payoutMethodID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payoutMethodID' is set
        if (payoutMethodID == null) {
            throw new ApiException("Missing the required parameter 'payoutMethodID' when calling getPayoutMethod(Async)");
        }
        

        okhttp3.Call localVarCall = getPayoutMethodCall(payoutMethodID, _callback);
        return localVarCall;

    }

    /**
     * Fetching a payout method
     * Show a payout method by id
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return PayoutMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayoutMethodResponse getPayoutMethod(UUID payoutMethodID) throws ApiException {
        ApiResponse<PayoutMethodResponse> localVarResp = getPayoutMethodWithHttpInfo(payoutMethodID);
        return localVarResp.getData();
    }

    /**
     * Fetching a payout method
     * Show a payout method by id
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @return ApiResponse&lt;PayoutMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayoutMethodResponse> getPayoutMethodWithHttpInfo(UUID payoutMethodID) throws ApiException {
        okhttp3.Call localVarCall = getPayoutMethodValidateBeforeCall(payoutMethodID, null);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetching a payout method (asynchronously)
     * Show a payout method by id
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getPayoutMethodAsync(UUID payoutMethodID, final ApiCallback<PayoutMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPayoutMethodValidateBeforeCall(payoutMethodID, _callback);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPayoutMethods
     * @param state Allows filtering results by &#x60;state&#x60; of the payout method.  Example: &#x60;/v1/payout_methods?state[]&#x3D;enabled&#x60; (optional)
     * @param type Allows filtering results by the specified type.  Example: &#x60;/v1/payout_methods?type[]&#x3D;NGN::Bank&#x60; (optional)
     * @param senderId Allows filtering results by the specified sender id.  Example: &#x60;/v1/payout_methods?sender_id&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (optional)
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getPayoutMethodsCall(List<String> state, List<String> type, String senderId, Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/payout_methods";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (state != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "state", state));
        }

        if (type != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "type", type));
        }

        if (senderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sender_id", senderId));
        }

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
    private okhttp3.Call getPayoutMethodsValidateBeforeCall(List<String> state, List<String> type, String senderId, Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPayoutMethodsCall(state, type, senderId, page, per, createdAtFrom, createdAtTo, _callback);
        return localVarCall;

    }

    /**
     * Listing payout methods
     * List available payout methods
     * @param state Allows filtering results by &#x60;state&#x60; of the payout method.  Example: &#x60;/v1/payout_methods?state[]&#x3D;enabled&#x60; (optional)
     * @param type Allows filtering results by the specified type.  Example: &#x60;/v1/payout_methods?type[]&#x3D;NGN::Bank&#x60; (optional)
     * @param senderId Allows filtering results by the specified sender id.  Example: &#x60;/v1/payout_methods?sender_id&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (optional)
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return PayoutMethodListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayoutMethodListResponse getPayoutMethods(List<String> state, List<String> type, String senderId, Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        ApiResponse<PayoutMethodListResponse> localVarResp = getPayoutMethodsWithHttpInfo(state, type, senderId, page, per, createdAtFrom, createdAtTo);
        return localVarResp.getData();
    }

    /**
     * Listing payout methods
     * List available payout methods
     * @param state Allows filtering results by &#x60;state&#x60; of the payout method.  Example: &#x60;/v1/payout_methods?state[]&#x3D;enabled&#x60; (optional)
     * @param type Allows filtering results by the specified type.  Example: &#x60;/v1/payout_methods?type[]&#x3D;NGN::Bank&#x60; (optional)
     * @param senderId Allows filtering results by the specified sender id.  Example: &#x60;/v1/payout_methods?sender_id&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (optional)
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return ApiResponse&lt;PayoutMethodListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayoutMethodListResponse> getPayoutMethodsWithHttpInfo(List<String> state, List<String> type, String senderId, Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        okhttp3.Call localVarCall = getPayoutMethodsValidateBeforeCall(state, type, senderId, page, per, createdAtFrom, createdAtTo, null);
        Type localVarReturnType = new TypeToken<PayoutMethodListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Listing payout methods (asynchronously)
     * List available payout methods
     * @param state Allows filtering results by &#x60;state&#x60; of the payout method.  Example: &#x60;/v1/payout_methods?state[]&#x3D;enabled&#x60; (optional)
     * @param type Allows filtering results by the specified type.  Example: &#x60;/v1/payout_methods?type[]&#x3D;NGN::Bank&#x60; (optional)
     * @param senderId Allows filtering results by the specified sender id.  Example: &#x60;/v1/payout_methods?sender_id&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (optional)
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getPayoutMethodsAsync(List<String> state, List<String> type, String senderId, Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback<PayoutMethodListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPayoutMethodsValidateBeforeCall(state, type, senderId, page, per, createdAtFrom, createdAtTo, _callback);
        Type localVarReturnType = new TypeToken<PayoutMethodListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchPayoutMethod
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payoutMethod  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call patchPayoutMethodCall(UUID payoutMethodID, PayoutMethod payoutMethod, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = payoutMethod;

        // create path and map variables
        String localVarPath = "/payout_methods/{Payout Method ID}"
            .replaceAll("\\{" + "Payout Method ID" + "\\}", localVarApiClient.escapeString(payoutMethodID.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPayoutMethodValidateBeforeCall(UUID payoutMethodID, PayoutMethod payoutMethod, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payoutMethodID' is set
        if (payoutMethodID == null) {
            throw new ApiException("Missing the required parameter 'payoutMethodID' when calling patchPayoutMethod(Async)");
        }
        
        // verify the required parameter 'payoutMethod' is set
        if (payoutMethod == null) {
            throw new ApiException("Missing the required parameter 'payoutMethod' when calling patchPayoutMethod(Async)");
        }
        

        okhttp3.Call localVarCall = patchPayoutMethodCall(payoutMethodID, payoutMethod, _callback);
        return localVarCall;

    }

    /**
     * Updating a payout method
     * Updates the payout method specified in the URL path.
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payoutMethod  (required)
     * @return PayoutMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayoutMethodResponse patchPayoutMethod(UUID payoutMethodID, PayoutMethod payoutMethod) throws ApiException {
        ApiResponse<PayoutMethodResponse> localVarResp = patchPayoutMethodWithHttpInfo(payoutMethodID, payoutMethod);
        return localVarResp.getData();
    }

    /**
     * Updating a payout method
     * Updates the payout method specified in the URL path.
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payoutMethod  (required)
     * @return ApiResponse&lt;PayoutMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayoutMethodResponse> patchPayoutMethodWithHttpInfo(UUID payoutMethodID, PayoutMethod payoutMethod) throws ApiException {
        okhttp3.Call localVarCall = patchPayoutMethodValidateBeforeCall(payoutMethodID, payoutMethod, null);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updating a payout method (asynchronously)
     * Updates the payout method specified in the URL path.
     * @param payoutMethodID ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; (required)
     * @param payoutMethod  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call patchPayoutMethodAsync(UUID payoutMethodID, PayoutMethod payoutMethod, final ApiCallback<PayoutMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchPayoutMethodValidateBeforeCall(payoutMethodID, payoutMethod, _callback);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postPayoutMethods
     * @param payoutMethodRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postPayoutMethodsCall(PayoutMethodRequest payoutMethodRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = payoutMethodRequest;

        // create path and map variables
        String localVarPath = "/payout_methods";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postPayoutMethodsValidateBeforeCall(PayoutMethodRequest payoutMethodRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payoutMethodRequest' is set
        if (payoutMethodRequest == null) {
            throw new ApiException("Missing the required parameter 'payoutMethodRequest' when calling postPayoutMethods(Async)");
        }
        

        okhttp3.Call localVarCall = postPayoutMethodsCall(payoutMethodRequest, _callback);
        return localVarCall;

    }

    /**
     * Creating a payout method
     * Creates a new payout method in our system. 
     * @param payoutMethodRequest  (required)
     * @return PayoutMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PayoutMethodResponse postPayoutMethods(PayoutMethodRequest payoutMethodRequest) throws ApiException {
        ApiResponse<PayoutMethodResponse> localVarResp = postPayoutMethodsWithHttpInfo(payoutMethodRequest);
        return localVarResp.getData();
    }

    /**
     * Creating a payout method
     * Creates a new payout method in our system. 
     * @param payoutMethodRequest  (required)
     * @return ApiResponse&lt;PayoutMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PayoutMethodResponse> postPayoutMethodsWithHttpInfo(PayoutMethodRequest payoutMethodRequest) throws ApiException {
        okhttp3.Call localVarCall = postPayoutMethodsValidateBeforeCall(payoutMethodRequest, null);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creating a payout method (asynchronously)
     * Creates a new payout method in our system. 
     * @param payoutMethodRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call postPayoutMethodsAsync(PayoutMethodRequest payoutMethodRequest, final ApiCallback<PayoutMethodResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postPayoutMethodsValidateBeforeCall(payoutMethodRequest, _callback);
        Type localVarReturnType = new TypeToken<PayoutMethodResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
