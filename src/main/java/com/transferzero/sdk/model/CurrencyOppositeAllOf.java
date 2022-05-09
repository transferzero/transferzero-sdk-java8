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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CurrencyOppositeAllOf
 */

public class CurrencyOppositeAllOf {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private BigDecimal rate;

  public static final String SERIALIZED_NAME_MTM_RATE = "mtm_rate";
  @SerializedName(SERIALIZED_NAME_MTM_RATE)
  private BigDecimal mtmRate;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private String margin;


   /**
   * The rate of this particular currency with the base one
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rate of this particular currency with the base one")

  public BigDecimal getRate() {
    return rate;
  }




   /**
   * Mark to market rate of this particular currency against the base one with the margin factored in
   * @return mtmRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mark to market rate of this particular currency against the base one with the margin factored in")

  public BigDecimal getMtmRate() {
    return mtmRate;
  }




   /**
   * The margin set for transactions of this particular currency with the base one
   * @return margin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The margin set for transactions of this particular currency with the base one")

  public String getMargin() {
    return margin;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyOppositeAllOf currencyOppositeAllOf = (CurrencyOppositeAllOf) o;
    return Objects.equals(this.rate, currencyOppositeAllOf.rate) &&
        Objects.equals(this.mtmRate, currencyOppositeAllOf.mtmRate) &&
        Objects.equals(this.margin, currencyOppositeAllOf.margin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, mtmRate, margin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyOppositeAllOf {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    mtmRate: ").append(toIndentedString(mtmRate)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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

