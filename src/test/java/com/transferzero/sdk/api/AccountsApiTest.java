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
import com.transferzero.sdk.model.AccountListResponse;
import com.transferzero.sdk.model.AccountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * Fetches account balance for specified currrency
     *
     * Fetches account balance for specified currrency, and returns current balance and associated currency code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        String currency = null;
        AccountResponse response = api.getAccount(currency)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Fetches account balances for all currencies
     *
     * Fetches account balances for all currencies, and returns an array of the current balances and associated currency codes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsTest() throws ApiException {
        AccountListResponse response = api.getAccounts()
                .execute();

        // TODO: test validations
    }
    
}
