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
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;First\&quot;,     \&quot;last_name\&quot;: \&quot;Last\&quot;,     \&quot;street\&quot;: \&quot;1 Linford Street\&quot;,     \&quot;city\&quot;: \&quot;Nairobi\&quot;,     \&quot;phone_number\&quot;: \&quot;+254123456789\&quot;, // E.164 international format     \&quot;identity_card_type\&quot;: \&quot;ID\&quot;, // refers to the recipient&#39;s ID details; Values: \&quot;PP\&quot;: Passport, \&quot;ID\&quot;: National ID or \&quot;O\&quot;: Other     \&quot;identity_card_id\&quot;: &#39;AB12345678&#39;, // refers to the recipient&#39;s ID details     \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot;,     \&quot;mobile_provider\&quot;: \&quot;mpesa\&quot;,     \&quot;relationship_to_sender\&quot;: \&quot;Aunt\&quot; // Optional   } &#x60;&#x60;&#x60;  See [KES Mobile](https://docs.transferzero.com/docs/payout-details/#kesmobile) documentation for transfer_reason lists
 */
@ApiModel(description = "```JSON   \"details\": {     \"first_name\": \"First\",     \"last_name\": \"Last\",     \"street\": \"1 Linford Street\",     \"city\": \"Nairobi\",     \"phone_number\": \"+254123456789\", // E.164 international format     \"identity_card_type\": \"ID\", // refers to the recipient's ID details; Values: \"PP\": Passport, \"ID\": National ID or \"O\": Other     \"identity_card_id\": 'AB12345678', // refers to the recipient's ID details     \"transfer_reason\": \"personal_account\",     \"mobile_provider\": \"mpesa\",     \"relationship_to_sender\": \"Aunt\" // Optional   } ```  See [KES Mobile](https://docs.transferzero.com/docs/payout-details/#kesmobile) documentation for transfer_reason lists")

public class PayoutMethodDetailsKESMobile {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_TRANSFER_REASON_CODE = "transfer_reason_code";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON_CODE)
  private String transferReasonCode;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public static final String SERIALIZED_NAME_RELATIONSHIP_TO_SENDER = "relationship_to_sender";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_TO_SENDER)
  private String relationshipToSender;

  public PayoutMethodDetailsKESMobile firstName(String firstName) {
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

  public PayoutMethodDetailsKESMobile lastName(String lastName) {
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

  public PayoutMethodDetailsKESMobile street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PayoutMethodDetailsKESMobile city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PayoutMethodDetailsKESMobile phoneNumber(String phoneNumber) {
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

  public PayoutMethodDetailsKESMobile mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
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

  public PayoutMethodDetailsKESMobile transferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
    return this;
  }

   /**
   * Get transferReasonCode
   * @return transferReasonCode
  **/
  @ApiModelProperty(value = "")
  public String getTransferReasonCode() {
    return transferReasonCode;
  }

  public void setTransferReasonCode(String transferReasonCode) {
    this.transferReasonCode = transferReasonCode;
  }

  public PayoutMethodDetailsKESMobile transferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
    return this;
  }

   /**
   * Get transferReason
   * @return transferReason
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodTransferReasonEnum getTransferReason() {
    return transferReason;
  }

  public void setTransferReason(PayoutMethodTransferReasonEnum transferReason) {
    this.transferReason = transferReason;
  }

  public PayoutMethodDetailsKESMobile identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
    return this;
  }

   /**
   * Get identityCardType
   * @return identityCardType
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodIdentityCardTypeEnum getIdentityCardType() {
    return identityCardType;
  }

  public void setIdentityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
  }

  public PayoutMethodDetailsKESMobile identityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
    return this;
  }

   /**
   * Get identityCardId
   * @return identityCardId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdentityCardId() {
    return identityCardId;
  }

  public void setIdentityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
  }

  public PayoutMethodDetailsKESMobile relationshipToSender(String relationshipToSender) {
    this.relationshipToSender = relationshipToSender;
    return this;
  }

   /**
   * Get relationshipToSender
   * @return relationshipToSender
  **/
  @ApiModelProperty(value = "")
  public String getRelationshipToSender() {
    return relationshipToSender;
  }

  public void setRelationshipToSender(String relationshipToSender) {
    this.relationshipToSender = relationshipToSender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsKESMobile payoutMethodDetailsKESMobile = (PayoutMethodDetailsKESMobile) o;
    return Objects.equals(this.firstName, payoutMethodDetailsKESMobile.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsKESMobile.lastName) &&
        Objects.equals(this.street, payoutMethodDetailsKESMobile.street) &&
        Objects.equals(this.city, payoutMethodDetailsKESMobile.city) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsKESMobile.phoneNumber) &&
        Objects.equals(this.mobileProvider, payoutMethodDetailsKESMobile.mobileProvider) &&
        Objects.equals(this.transferReasonCode, payoutMethodDetailsKESMobile.transferReasonCode) &&
        Objects.equals(this.transferReason, payoutMethodDetailsKESMobile.transferReason) &&
        Objects.equals(this.identityCardType, payoutMethodDetailsKESMobile.identityCardType) &&
        Objects.equals(this.identityCardId, payoutMethodDetailsKESMobile.identityCardId) &&
        Objects.equals(this.relationshipToSender, payoutMethodDetailsKESMobile.relationshipToSender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, street, city, phoneNumber, mobileProvider, transferReasonCode, transferReason, identityCardType, identityCardId, relationshipToSender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsKESMobile {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    transferReasonCode: ").append(toIndentedString(transferReasonCode)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
    sb.append("    relationshipToSender: ").append(toIndentedString(relationshipToSender)).append("\n");
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

