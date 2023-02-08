# EntitiesApi

All URIs are relative to *https://api-sandbox.bitpesa.co/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntities**](EntitiesApi.md#getEntities) | **GET** /risk_assessment/entities/{Entity Type}/summary | Listing entities
[**getEntitiesByParams**](EntitiesApi.md#getEntitiesByParams) | **GET** /risk_assessment/entities/{Entity Type}/search | Listing entities by params (rating and/or state)
[**getEntity**](EntitiesApi.md#getEntity) | **GET** /risk_assessment/entities/{Entity Type}/{Entity ID} | Fetching a entity
[**patchEntity**](EntitiesApi.md#patchEntity) | **PATCH** /risk_assessment/entities/{Entity Type}/{Entity ID} | Updating an entity
[**postEntity**](EntitiesApi.md#postEntity) | **POST** /risk_assessment/entities/{Entity Type}/{Entity ID} | Creating an entity


<a name="getEntities"></a>
# **getEntities**
> EntityListResponse getEntities(entityType, ids).execute();

Listing entities

Get a list of entities

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.EntitiesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

EntitiesApi apiInstance = new EntitiesApi(apiClient);
String entityType = "entityType_example"; // String | Type of entities to get.  Example: `/risk_assessment/entities/sender/summary?ids[]=bf9ff782-e182-45ac-abea-5bce83ad6670&ids[]=344fb668-196d-43db-9d94-b34b7e6c7e0b`
List<String> ids = Arrays.asList(); // List<String> | Returns entities of specified entity(e.g Sender) id(s). This allows the fetching of entities for multiple e.g. senders  Example: `/risk_assessment/entities/sender?ids[]=bf9ff782-e182-45ac-abea-5bce83ad6670&ids[]=344fb668-196d-43db-9d94-b34b7e6c7e0b`
try {
    EntityListResponse result = apiInstance.getEntities(entityType, ids)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        EntityListResponse result = e.getResponseObject(EntityListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling EntitiesApi#getEntities");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Type of entities to get.  Example: &#x60;/risk_assessment/entities/sender/summary?ids[]&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&amp;ids[]&#x3D;344fb668-196d-43db-9d94-b34b7e6c7e0b&#x60; |
 **ids** | [**List&lt;String&gt;**](String.md)| Returns entities of specified entity(e.g Sender) id(s). This allows the fetching of entities for multiple e.g. senders  Example: &#x60;/risk_assessment/entities/sender?ids[]&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&amp;ids[]&#x3D;344fb668-196d-43db-9d94-b34b7e6c7e0b&#x60; |

### Return type

[**EntityListResponse**](EntityListResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEntitiesByParams"></a>
# **getEntitiesByParams**
> EntityListResponse getEntitiesByParams(entityType).rating(rating).state(state).execute();

Listing entities by params (rating and/or state)

Get a list of entities scoped by the requested params (rating and/or state)

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.EntitiesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

EntitiesApi apiInstance = new EntitiesApi(apiClient);
String entityType = "entityType_example"; // String | Type of entities to retrieve.  Example: `/risk_assessment/entities/sender/search?rating=extremely_high&state=complete`
String rating = "rating_example"; // String | Returns a list of entities scoped by the Entity rating (rating param can be one of 'extremely_high', 'high_risk', 'medium_risk' or 'low_risk')  Example: `/risk_assessment/entities/Sender::Business/search?rating=extremely_high`
String state = "state_example"; // String | Returns a list of entities scoped by the Entity state (state param can be one of 'complete' or 'incomplete')  Example: `/risk_assessment/entities/Sender::Business/search?state=complete`
try {
    EntityListResponse result = apiInstance.getEntitiesByParams(entityType)
            .rating(rating)
            .state(state)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        EntityListResponse result = e.getResponseObject(EntityListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling EntitiesApi#getEntitiesByParams");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Type of entities to retrieve.  Example: &#x60;/risk_assessment/entities/sender/search?rating&#x3D;extremely_high&amp;state&#x3D;complete&#x60; |
 **rating** | **String**| Returns a list of entities scoped by the Entity rating (rating param can be one of &#39;extremely_high&#39;, &#39;high_risk&#39;, &#39;medium_risk&#39; or &#39;low_risk&#39;)  Example: &#x60;/risk_assessment/entities/Sender::Business/search?rating&#x3D;extremely_high&#x60; | [optional]
 **state** | **String**| Returns a list of entities scoped by the Entity state (state param can be one of &#39;complete&#39; or &#39;incomplete&#39;)  Example: &#x60;/risk_assessment/entities/Sender::Business/search?state&#x3D;complete&#x60; | [optional]

### Return type

[**EntityListResponse**](EntityListResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEntity"></a>
# **getEntity**
> EntityCreateResponse getEntity(entityType, entityID).execute();

Fetching a entity

Returns a single entity by the Entity ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.EntitiesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

EntitiesApi apiInstance = new EntitiesApi(apiClient);
String entityType = "entityType_example"; // String | Type of entities to get.  Example: `/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670`
UUID entityID = new UUID(); // UUID | ID of the entity to get.  Example: `/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    EntityCreateResponse result = apiInstance.getEntity(entityType, entityID)
            .execute();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        EntityCreateResponse result = e.getResponseObject(EntityCreateResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling EntitiesApi#getEntity");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Type of entities to get.  Example: &#x60;/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **entityID** | [**UUID**](.md)| ID of the entity to get.  Example: &#x60;/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**EntityCreateResponse**](EntityCreateResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchEntity"></a>
# **patchEntity**
> EntityUpdateResponse patchEntity(entityType, entityID, entityUpdateRequest)

Updating an entity

Updates a single entity by the Entity ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.EntitiesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

EntitiesApi apiInstance = new EntitiesApi(apiClient);
String entityType = "entityType_example"; // String | Type of entities to get.  Example: `/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670`
UUID entityID = new UUID(); // UUID | ID of the entity to get.  Example: `/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670`
EntityUpdateRequest entityUpdateRequest = {
  "manual_fields": {
    "sanctions_lists_checked": "yes",
    "adverse_media": "no",
    "company_based_in_sanctioned_country": "yes",
    "formal_actions_less_than_6_months": "no",
    "formal_actions_6_to_12_months": "yes",
    "formal_actions_12_to_24_months": "no",
    "under_investigation": "yes",
    "remarks": "nothing to add"
  }
}; // EntityUpdateRequest | 
try {
    EntityUpdateResponse result = apiInstance.patchEntity(entityType, entityID, entityUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        EntityUpdateResponse result = e.getResponseObject(EntityUpdateResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling EntitiesApi#patchEntity");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Type of entities to get.  Example: &#x60;/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **entityID** | [**UUID**](.md)| ID of the entity to get.  Example: &#x60;/risk_assessment/entities/sender/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **entityUpdateRequest** | [**EntityUpdateRequest**](EntityUpdateRequest.md)|  |

### Return type

[**EntityUpdateResponse**](EntityUpdateResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEntity"></a>
# **postEntity**
> EntityCreateResponse postEntity(entityType, entityID, entityCreateRequest)

Creating an entity

Creates a new entity. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.EntitiesApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");

EntitiesApi apiInstance = new EntitiesApi(apiClient);
String entityType = "entityType_example"; // String | Type of entity to create.
UUID entityID = new UUID(); // UUID | ID of entity type to create entity for.  Example: `/risk_assessment/entities/sender/e6f67a67-b2c2-4897-ad58-9fc3a9d8d991`
EntityCreateRequest entityCreateRequest = {
  "automated_fields": {
    "financial_institution": "true",
    "financial_regulator": "",
    "regulatory_licence_number": "",
    "amount_monthly_transactions": "Above $500,000",
    "country_of_incorporation": "AF",
    "trading_country": "US",
    "shareholders_nationalities": ["AF", "GB", "IT"],
    "directors_nationalities": ["AU", "BE", "GM"],
    "directors_residences": ["AR", "HK", "SS"],
    "sanction_check_state": "1"
  }
}; // EntityCreateRequest | 
try {
    EntityCreateResponse result = apiInstance.postEntity(entityType, entityID, entityCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        EntityCreateResponse result = e.getResponseObject(EntityCreateResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling EntitiesApi#postEntity");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Type of entity to create. |
 **entityID** | [**UUID**](.md)| ID of entity type to create entity for.  Example: &#x60;/risk_assessment/entities/sender/e6f67a67-b2c2-4897-ad58-9fc3a9d8d991&#x60; |
 **entityCreateRequest** | [**EntityCreateRequest**](EntityCreateRequest.md)|  |

### Return type

[**EntityCreateResponse**](EntityCreateResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.bitpesa.co/v1");
```
### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

