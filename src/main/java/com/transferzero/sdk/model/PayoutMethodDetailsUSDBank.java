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
import com.transferzero.sdk.model.PayoutMethodCountryEnumUSDBank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;Jane\&quot;,     \&quot;last_name\&quot;: \&quot;Doe\&quot;,     \&quot;phone_number\&quot;: \&quot;+2341234567\&quot;,     \&quot;bank_code\&quot;: \&quot;057\&quot;,     \&quot;bank_account\&quot;: \&quot;1234567890\&quot;,     \&quot;country\&quot;: \&quot;NG\&quot;   } &#x60;&#x60;&#x60; See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank) documentation for the bank_code list
 */
@ApiModel(description = "```JSON   \"details\": {     \"first_name\": \"Jane\",     \"last_name\": \"Doe\",     \"phone_number\": \"+2341234567\",     \"bank_code\": \"057\",     \"bank_account\": \"1234567890\",     \"country\": \"NG\"   } ``` See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank) documentation for the bank_code list")

public class PayoutMethodDetailsUSDBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnumUSDBank country;

  public PayoutMethodDetailsUSDBank firstName(String firstName) {
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

  public PayoutMethodDetailsUSDBank lastName(String lastName) {
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

  public PayoutMethodDetailsUSDBank phoneNumber(String phoneNumber) {
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

  public PayoutMethodDetailsUSDBank bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public PayoutMethodDetailsUSDBank bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PayoutMethodDetailsUSDBank country(PayoutMethodCountryEnumUSDBank country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodCountryEnumUSDBank getCountry() {
    return country;
  }

  public void setCountry(PayoutMethodCountryEnumUSDBank country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsUSDBank payoutMethodDetailsUSDBank = (PayoutMethodDetailsUSDBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsUSDBank.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsUSDBank.lastName) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsUSDBank.phoneNumber) &&
        Objects.equals(this.bankCode, payoutMethodDetailsUSDBank.bankCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsUSDBank.bankAccount) &&
        Objects.equals(this.country, payoutMethodDetailsUSDBank.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, bankCode, bankAccount, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsUSDBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

