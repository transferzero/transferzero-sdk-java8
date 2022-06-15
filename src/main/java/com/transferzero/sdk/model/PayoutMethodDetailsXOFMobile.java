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
import com.transferzero.sdk.model.PayoutMethodCountryEnum;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;first_name\&quot;: \&quot;First\&quot;,   \&quot;last_name\&quot;: \&quot;Last\&quot;,   \&quot;phone_number\&quot;: \&quot;774044436\&quot;, // local or international Senegalese or Ivory Coast format   \&quot;mobile_provider\&quot;: \&quot;orange\&quot;, // \&quot;orange\&quot;, \&quot;tigo\&quot;, \&quot;emoney\&quot;, \&quot;free\&quot; or \&quot;wave\&quot; for Senegal; \&quot;orange\&quot;, \&quot;mtn\&quot; or \&quot;moov\&quot; for Ivory Coast; \&quot;orange\&quot; or \&quot;mobicash\&quot; for Burkina Faso and Mali   \&quot;country\&quot; // Optional; Values: \&quot;SN\&quot; for Senegal; \&quot;CI\&quot; for Ivory Coast; \&quot;ML\&quot; for Mali; \&quot;BF\&quot; for Burkina Faso; Default value is \&quot;SN\&quot;   \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot; // mandatory for Mali payouts, optional otherwise } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON \"details\": {   \"first_name\": \"First\",   \"last_name\": \"Last\",   \"phone_number\": \"774044436\", // local or international Senegalese or Ivory Coast format   \"mobile_provider\": \"orange\", // \"orange\", \"tigo\", \"emoney\", \"free\" or \"wave\" for Senegal; \"orange\", \"mtn\" or \"moov\" for Ivory Coast; \"orange\" or \"mobicash\" for Burkina Faso and Mali   \"country\" // Optional; Values: \"SN\" for Senegal; \"CI\" for Ivory Coast; \"ML\" for Mali; \"BF\" for Burkina Faso; Default value is \"SN\"   \"transfer_reason\": \"personal_account\" // mandatory for Mali payouts, optional otherwise } ```")

public class PayoutMethodDetailsXOFMobile {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnum country;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public PayoutMethodDetailsXOFMobile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PayoutMethodDetailsXOFMobile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PayoutMethodDetailsXOFMobile phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PayoutMethodDetailsXOFMobile mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
    return this;
  }

   /**
   * Get mobileProvider
   * @return mobileProvider
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodMobileProviderEnum getMobileProvider() {
    return mobileProvider;
  }

  public void setMobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
    this.mobileProvider = mobileProvider;
  }

  public PayoutMethodDetailsXOFMobile country(PayoutMethodCountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodCountryEnum getCountry() {
    return country;
  }

  public void setCountry(PayoutMethodCountryEnum country) {
    this.country = country;
  }

  public PayoutMethodDetailsXOFMobile transferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
    return this;
  }

   /**
   * Get transferReason
   * @return transferReason
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodTransferReasonEnum getTransferReason() {
    return transferReason;
  }

  public void setTransferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsXOFMobile payoutMethodDetailsXOFMobile = (PayoutMethodDetailsXOFMobile) o;
    return Objects.equals(this.firstName, payoutMethodDetailsXOFMobile.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsXOFMobile.lastName) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsXOFMobile.phoneNumber) &&
        Objects.equals(this.mobileProvider, payoutMethodDetailsXOFMobile.mobileProvider) &&
        Objects.equals(this.country, payoutMethodDetailsXOFMobile.country) &&
        Objects.equals(this.transferReason, payoutMethodDetailsXOFMobile.transferReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, mobileProvider, country, transferReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsXOFMobile {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
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

