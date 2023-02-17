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


package com.transferzero.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionReqLimitsResponseObject
 */

public class TransactionReqLimitsResponseObject {
  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Integer minimum;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Integer maximum;

  public TransactionReqLimitsResponseObject minimum(Integer minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * The minimum limit for transaction requests (in USD)
   * @return minimum
  **/
  @ApiModelProperty(example = "2000", value = "The minimum limit for transaction requests (in USD)")
  public Integer getMinimum() {
    return minimum;
  }

  public void setMinimum(Integer minimum) {
    this.minimum = minimum;
  }

  public TransactionReqLimitsResponseObject maximum(Integer maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * The maximum limit for transaction requests (in USD)
   * @return maximum
  **/
  @ApiModelProperty(example = "1500000", value = "The maximum limit for transaction requests (in USD)")
  public Integer getMaximum() {
    return maximum;
  }

  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReqLimitsResponseObject transactionReqLimitsResponseObject = (TransactionReqLimitsResponseObject) o;
    return Objects.equals(this.minimum, transactionReqLimitsResponseObject.minimum) &&
        Objects.equals(this.maximum, transactionReqLimitsResponseObject.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReqLimitsResponseObject {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
