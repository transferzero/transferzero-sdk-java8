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

import com.transferzero.sdk.ApiException;
import com.transferzero.sdk.model.OpenCorporatesSenderUpdateRequest;
import com.transferzero.sdk.model.OpenCorporatesSenderUpdateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpenCorporatesSenderUpdateApi
 */
@Ignore
public class OpenCorporatesSenderUpdateApiTest {

    private final OpenCorporatesSenderUpdateApi api = new OpenCorporatesSenderUpdateApi();

    
    /**
     * Update Sender with data retrieved from Open Corporates
     *
     * This endpoint searches for a company on Open Corporates API and updates the associated Sender fields with the search results
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSenderTest() throws ApiException {
        OpenCorporatesSenderUpdateRequest openCorporatesSenderUpdateRequest = null;
        OpenCorporatesSenderUpdateResponse response = api.updateSender(openCorporatesSenderUpdateRequest);

        // TODO: test validations
    }
    
}