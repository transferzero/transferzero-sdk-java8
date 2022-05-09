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


package com.transferzero.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.transferzero.sdk.model.SenderResponseExisting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SenderResponseMeta
 */

public class SenderResponseMeta {
  public static final String SERIALIZED_NAME_EXISTING = "existing";
  @SerializedName(SERIALIZED_NAME_EXISTING)
  private SenderResponseExisting existing;


  public SenderResponseMeta existing(SenderResponseExisting existing) {
    
    this.existing = existing;
    return this;
  }

   /**
   * Get existing
   * @return existing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SenderResponseExisting getExisting() {
    return existing;
  }



  public void setExisting(SenderResponseExisting existing) {
    this.existing = existing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderResponseMeta senderResponseMeta = (SenderResponseMeta) o;
    return Objects.equals(this.existing, senderResponseMeta.existing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderResponseMeta {\n");
    sb.append("    existing: ").append(toIndentedString(existing)).append("\n");
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

