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


package com.transferzero.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Object that holds where to send webhooks, and what events should it be triggered with
 */
@ApiModel(description = "Object that holds where to send webhooks, and what events should it be triggered with")

public class WebhookDefinition {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = new HashMap<>();

  public WebhookDefinition url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to receive the webhook
   * @return url
  **/
  @ApiModelProperty(example = "http://webhook.site/webhooks", required = true, value = "The URL to receive the webhook")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookDefinition events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookDefinition addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * A list of events to subscribe to
   * @return events
  **/
  @ApiModelProperty(required = true, value = "A list of events to subscribe to")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public WebhookDefinition metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

   /**
   * The ID of the webhook
   * @return id
  **/
  @ApiModelProperty(example = "1cd580b2-2a1b-4f73-81c8-0308308baef2", value = "The ID of the webhook")
  public String getId() {
    return id;
  }

   /**
   * The fields that have some problems and don&#39;t pass validation
   * @return errors
  **/
  @ApiModelProperty(example = "{\"phone_number\":[{\"error\":\"invalid\"}],\"documents\":[{\"error\":\"blank\"}]}", value = "The fields that have some problems and don't pass validation")
  public Map<String, List<ValidationErrorDescription>> getErrors() {
    return errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDefinition webhookDefinition = (WebhookDefinition) o;
    return Objects.equals(this.url, webhookDefinition.url) &&
        Objects.equals(this.events, webhookDefinition.events) &&
        Objects.equals(this.metadata, webhookDefinition.metadata) &&
        Objects.equals(this.id, webhookDefinition.id) &&
        Objects.equals(this.errors, webhookDefinition.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, events, metadata, id, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDefinition {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
