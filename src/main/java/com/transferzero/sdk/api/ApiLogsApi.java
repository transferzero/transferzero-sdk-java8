/*
 * TransferZero API
 * Reference documentation for the TransferZero API V1
 *
 * The version of the OpenAPI document: 1.0
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


import com.transferzero.sdk.model.ApiLogListResponse;
import com.transferzero.sdk.model.ApiLogResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiLogsApi {
    private ApiClient localVarApiClient;

    public ApiLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiLogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getApiLogCall(UUID apILogID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api_logs/{API Log ID}"
            .replaceAll("\\{" + "API Log ID" + "\\}", localVarApiClient.escapeString(apILogID.toString()));

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
    private okhttp3.Call getApiLogValidateBeforeCall(UUID apILogID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'apILogID' is set
        if (apILogID == null) {
            throw new ApiException("Missing the required parameter 'apILogID' when calling getApiLog(Async)");
        }
        

        okhttp3.Call localVarCall = getApiLogCall(apILogID, _callback);
        return localVarCall;

    }


    private ApiResponse<ApiLogResponse> getApiLogWithHttpInfo(UUID apILogID) throws ApiException {
        okhttp3.Call localVarCall = getApiLogValidateBeforeCall(apILogID, null);
        Type localVarReturnType = new TypeToken<ApiLogResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getApiLogAsync(UUID apILogID, final ApiCallback<ApiLogResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApiLogValidateBeforeCall(apILogID, _callback);
        Type localVarReturnType = new TypeToken<ApiLogResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetApiLogRequest {
        private final UUID apILogID;

        private APIgetApiLogRequest(UUID apILogID) {
            this.apILogID = apILogID;
        }

        /**
         * Build call for getApiLog
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Details of requested API log </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getApiLogCall(apILogID, _callback);
        }

        /**
         * Execute getApiLog request
         * @return ApiLogResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Details of requested API log </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiLogResponse execute() throws ApiException {
            ApiResponse<ApiLogResponse> localVarResp = getApiLogWithHttpInfo(apILogID);
            return localVarResp.getData();
        }

        /**
         * Execute getApiLog request with HTTP info returned
         * @return ApiResponse&lt;ApiLogResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Details of requested API log </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiLogResponse> executeWithHttpInfo() throws ApiException {
            return getApiLogWithHttpInfo(apILogID);
        }

        /**
         * Execute getApiLog request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Details of requested API log </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiLogResponse> _callback) throws ApiException {
            return getApiLogAsync(apILogID, _callback);
        }
    }

    /**
     * Fetch an individual API log
     * Returns a single API log based on the API log ID.
     * @param apILogID ID of the API log to retrieve  Example: &#x60;/v1/api_logs/00485ce9-532b-45e7-8518-7e5582242407&#x60; (required)
     * @return APIgetApiLogRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Details of requested API log </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetApiLogRequest getApiLog(UUID apILogID) {
        return new APIgetApiLogRequest(apILogID);
    }
    private okhttp3.Call getApiLogsCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api_logs";

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
    private okhttp3.Call getApiLogsValidateBeforeCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getApiLogsCall(page, per, createdAtFrom, createdAtTo, _callback);
        return localVarCall;

    }


    private ApiResponse<ApiLogListResponse> getApiLogsWithHttpInfo(Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        okhttp3.Call localVarCall = getApiLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, null);
        Type localVarReturnType = new TypeToken<ApiLogListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getApiLogsAsync(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback<ApiLogListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApiLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, _callback);
        Type localVarReturnType = new TypeToken<ApiLogListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetApiLogsRequest {
        private Integer page;
        private Integer per;
        private String createdAtFrom;
        private String createdAtTo;

        private APIgetApiLogsRequest() {
        }

        /**
         * Set page
         * @param page The page number to request (defaults to 1) (optional)
         * @return APIgetApiLogsRequest
         */
        public APIgetApiLogsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set per
         * @param per The number of results to load per page (defaults to 10) (optional)
         * @return APIgetApiLogsRequest
         */
        public APIgetApiLogsRequest per(Integer per) {
            this.per = per;
            return this;
        }

        /**
         * Set createdAtFrom
         * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
         * @return APIgetApiLogsRequest
         */
        public APIgetApiLogsRequest createdAtFrom(String createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Set createdAtTo
         * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
         * @return APIgetApiLogsRequest
         */
        public APIgetApiLogsRequest createdAtTo(String createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Build call for getApiLogs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> API logs returned within an array wrapped inside a JSON object </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getApiLogsCall(page, per, createdAtFrom, createdAtTo, _callback);
        }

        /**
         * Execute getApiLogs request
         * @return ApiLogListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> API logs returned within an array wrapped inside a JSON object </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiLogListResponse execute() throws ApiException {
            ApiResponse<ApiLogListResponse> localVarResp = getApiLogsWithHttpInfo(page, per, createdAtFrom, createdAtTo);
            return localVarResp.getData();
        }

        /**
         * Execute getApiLogs request with HTTP info returned
         * @return ApiResponse&lt;ApiLogListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> API logs returned within an array wrapped inside a JSON object </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiLogListResponse> executeWithHttpInfo() throws ApiException {
            return getApiLogsWithHttpInfo(page, per, createdAtFrom, createdAtTo);
        }

        /**
         * Execute getApiLogs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> API logs returned within an array wrapped inside a JSON object </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiLogListResponse> _callback) throws ApiException {
            return getApiLogsAsync(page, per, createdAtFrom, createdAtTo, _callback);
        }
    }

    /**
     * Fetch a list of API logs
     * Returns a list of API logs. Also includes information relating to the original request.
     * @return APIgetApiLogsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API logs returned within an array wrapped inside a JSON object </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetApiLogsRequest getApiLogs() {
        return new APIgetApiLogsRequest();
    }
}
