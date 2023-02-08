/*
 * BitPesa Private API
 * API specification used for internal BitPesa endpoints
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


import com.transferzero.sdk.model.SanctionedCountryListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SanctionedCountriesApi {
    private ApiClient localVarApiClient;

    public SanctionedCountriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SanctionedCountriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getSanctionedCountriesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/sanctioned_countries";

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
    private okhttp3.Call getSanctionedCountriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSanctionedCountriesCall(_callback);
        return localVarCall;

    }


    private ApiResponse<SanctionedCountryListResponse> getSanctionedCountriesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSanctionedCountriesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<SanctionedCountryListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSanctionedCountriesAsync(final ApiCallback<SanctionedCountryListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSanctionedCountriesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SanctionedCountryListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetSanctionedCountriesRequest {

        private APIgetSanctionedCountriesRequest() {
        }

        /**
         * Build call for getSanctionedCountries
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSanctionedCountriesCall(_callback);
        }

        /**
         * Execute getSanctionedCountries request
         * @return SanctionedCountryListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public SanctionedCountryListResponse execute() throws ApiException {
            ApiResponse<SanctionedCountryListResponse> localVarResp = getSanctionedCountriesWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getSanctionedCountries request with HTTP info returned
         * @return ApiResponse&lt;SanctionedCountryListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ApiResponse<SanctionedCountryListResponse> executeWithHttpInfo() throws ApiException {
            return getSanctionedCountriesWithHttpInfo();
        }

        /**
         * Execute getSanctionedCountries request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<SanctionedCountryListResponse> _callback) throws ApiException {
            return getSanctionedCountriesAsync(_callback);
        }
    }

    /**
     * Get List of Sanctioned Countries
     * Get a list of sanctioned countries
     * @return APIgetSanctionedCountriesRequest
     */
    public APIgetSanctionedCountriesRequest getSanctionedCountries() {
        return new APIgetSanctionedCountriesRequest();
    }
}
