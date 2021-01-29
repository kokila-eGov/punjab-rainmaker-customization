/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.ErrorRes;
import io.swagger.client.model.RequestInfo;
import io.swagger.client.model.ResponseInfo;
import io.swagger.client.model.WaterConnectionRequest;
import io.swagger.client.model.WaterConnectionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WaterApi
 */
@Ignore
public class WaterApiTest {

    private final WaterApi api = new WaterApi();

    /**
     * Deactivate existing water connection.
     *
     * Deactivate existing water connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wcCancelPostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        String propertyId = null;
        ResponseInfo response = api.wcCancelPost(body, tenantId, propertyId);

        // TODO: test validations
    }
    /**
     * Apply for new water connection.
     *
     * Citizen or employee can apply for new water connection. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wcCreatePostTest() throws ApiException {
        WaterConnectionRequest body = null;
        WaterConnectionResponse response = api.wcCreatePost(body);

        // TODO: test validations
    }
    /**
     * Delete existing water connection.
     *
     * Delete existing water connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wcDeletePostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        String connectionNo = null;
        ResponseInfo response = api.wcDeletePost(body, tenantId, connectionNo);

        // TODO: test validations
    }
    /**
     * Get the list of exsting water connections.
     *
     * Get the water connections list based on the input parameters. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wcSearchPostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        List<String> ids = null;
        List<String> connectionNo = null;
        List<String> oldConnectionNo = null;
        Long mobileNumber = null;
        BigDecimal fromDate = null;
        BigDecimal toDate = null;
        WaterConnectionResponse response = api.wcSearchPost(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate);

        // TODO: test validations
    }
    /**
     * Update existing water connection details.
     *
     * Updates a given &#x60;water connection&#x60; with newer details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wcUpdatePostTest() throws ApiException {
        WaterConnectionRequest body = null;
        WaterConnectionResponse response = api.wcUpdatePost(body);

        // TODO: test validations
    }
}