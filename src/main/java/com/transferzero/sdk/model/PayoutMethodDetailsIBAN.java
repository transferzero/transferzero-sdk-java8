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

/**
 * &#x60;&#x60;&#x60;JSON \&quot;details\&quot;: {   \&quot;first_name\&quot;: \&quot;First\&quot;,   \&quot;last_name\&quot;: \&quot;Last\&quot;,   \&quot;bank_name\&quot;: \&quot;Deutsche Bank\&quot;,   \&quot;iban\&quot;: \&quot;DE89370400440532013000\&quot;,   \&quot;bic\&quot;: \&quot;DEUTDEBBXXX\&quot; // Optional } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "```JSON \"details\": {   \"first_name\": \"First\",   \"last_name\": \"Last\",   \"bank_name\": \"Deutsche Bank\",   \"iban\": \"DE89370400440532013000\",   \"bic\": \"DEUTDEBBXXX\" // Optional } ```")

public class PayoutMethodDetailsIBAN {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;


  public PayoutMethodDetailsIBAN firstName(String firstName) {
    
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


  public PayoutMethodDetailsIBAN lastName(String lastName) {
    
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


  public PayoutMethodDetailsIBAN bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankName() {
    return bankName;
  }



  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public PayoutMethodDetailsIBAN iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "")

  public String getIban() {
    return iban;
  }



  public void setIban(String iban) {
    this.iban = iban;
  }


  public PayoutMethodDetailsIBAN bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBic() {
    return bic;
  }



  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetailsIBAN payoutMethodDetailsIBAN = (PayoutMethodDetailsIBAN) o;
    return Objects.equals(this.firstName, payoutMethodDetailsIBAN.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetailsIBAN.lastName) &&
        Objects.equals(this.bankName, payoutMethodDetailsIBAN.bankName) &&
        Objects.equals(this.iban, payoutMethodDetailsIBAN.iban) &&
        Objects.equals(this.bic, payoutMethodDetailsIBAN.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, bankName, iban, bic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsIBAN {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

