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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;Jane\&quot;,     \&quot;last_name\&quot;: \&quot;Doe\&quot;,     \&quot;phone_number\&quot;: \&quot;+2341234567\&quot;, // E.164 international format     \&quot;country\&quot;: \&quot;NG\&quot;   } &#x60;&#x60;&#x60; See [USD Cash](https://docs.transferzero.com/docs/payout-details/#usdcash) documentation for the country list
 */
@ApiModel(description = "```JSON   \"details\": {     \"first_name\": \"Jane\",     \"last_name\": \"Doe\",     \"phone_number\": \"+2341234567\", // E.164 international format     \"country\": \"NG\"   } ``` See [USD Cash](https://docs.transferzero.com/docs/payout-details/#usdcash) documentation for the country list")

public class PayoutMethodDetailsUSDCash {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnum country;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public PayoutMethodDetailsUSDCash firstName(String firstName) {
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

  public PayoutMethodDetailsUSDCash lastName(String lastName) {
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

  public PayoutMethodDetailsUSDCash phoneNumber(String phoneNumber) {
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

  public PayoutMethodDetailsUSDCash country(PayoutMethodCountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodCountryEnum getCountry() {
    return country;
  }

  public void setCountry(PayoutMethodCountryEnum country) {
    this.country = country;
  }

  public PayoutMethodDetailsUSDCash birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Date of birth of recipient
   * @return birthDate
  **/
  @ApiModelProperty(value = "Date of birth of recipient")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsUSDCash payoutMethodDetailsUSDCash = (PayoutMethodDetailsUSDCash) o;
    return Objects.equals(this.firstName, payoutMethodDetailsUSDCash.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsUSDCash.lastName) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsUSDCash.phoneNumber) &&
        Objects.equals(this.country, payoutMethodDetailsUSDCash.country) &&
        Objects.equals(this.birthDate, payoutMethodDetailsUSDCash.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, country, birthDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsUSDCash {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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

