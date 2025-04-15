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
import com.transferzero.sdk.model.PayoutMethodBankAccountTypeEnum;
import com.transferzero.sdk.model.PayoutMethodCountryEnum;
import com.transferzero.sdk.model.PayoutMethodTransferReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Nigeria: &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;Jane\&quot;,     \&quot;last_name\&quot;: \&quot;Doe\&quot;,     \&quot;phone_number\&quot;: \&quot;+2341234567\&quot;, // E.164 international format     \&quot;bank_code\&quot;: \&quot;057\&quot;,     \&quot;bank_account\&quot;: \&quot;1234567890\&quot;,     \&quot;country\&quot;: \&quot;NG\&quot;   } &#x60;&#x60;&#x60; See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank) documentation for the bank_code and country lists  United States: &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;Jane\&quot;,     \&quot;last_name\&quot;: \&quot;Doe\&quot;,     \&quot;bank_account\&quot;: \&quot;1234567890\&quot;,     \&quot;bank_account_type\&quot;: \&quot;20\&quot;, // 10 for Savings, 20 for Checking     \&quot;bank_name\&quot;: \&quot;US Bank\&quot;,     \&quot;routing_number\&quot;: \&quot;091000022\&quot;,     \&quot;swift_code\&quot;: \&quot;USBKUS44IMT\&quot;,     \&quot;country\&quot;: \&quot;US\&quot;   } See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank-1) documentation  Egypt: &#x60;&#x60;&#x60;JSON   \&quot;details\&quot;: {     \&quot;first_name\&quot;: \&quot;Jane\&quot;,     \&quot;middle_name\&quot;: \&quot;Jill\&quot;, // optional     \&quot;last_name\&quot;: \&quot;Doe\&quot;,     \&quot;street\&quot;: \&quot;1 Main Street\&quot;,     \&quot;phone_number\&quot;: \&quot;+201023456789\&quot;,     \&quot;iban\&quot;: \&quot;EG380019000500000000263180002\&quot;,     \&quot;transfer_reason\&quot;: \&quot;personal_account\&quot;,   } &#x60;&#x60;&#x60; See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank-2) documentation
 */
@ApiModel(description = "Nigeria: ```JSON   \"details\": {     \"first_name\": \"Jane\",     \"last_name\": \"Doe\",     \"phone_number\": \"+2341234567\", // E.164 international format     \"bank_code\": \"057\",     \"bank_account\": \"1234567890\",     \"country\": \"NG\"   } ``` See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank) documentation for the bank_code and country lists  United States: ```JSON   \"details\": {     \"first_name\": \"Jane\",     \"last_name\": \"Doe\",     \"bank_account\": \"1234567890\",     \"bank_account_type\": \"20\", // 10 for Savings, 20 for Checking     \"bank_name\": \"US Bank\",     \"routing_number\": \"091000022\",     \"swift_code\": \"USBKUS44IMT\",     \"country\": \"US\"   } See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank-1) documentation  Egypt: ```JSON   \"details\": {     \"first_name\": \"Jane\",     \"middle_name\": \"Jill\", // optional     \"last_name\": \"Doe\",     \"street\": \"1 Main Street\",     \"phone_number\": \"+201023456789\",     \"iban\": \"EG380019000500000000263180002\",     \"transfer_reason\": \"personal_account\",   } ``` See [USD Bank](https://docs.transferzero.com/docs/payout-details/#usdbank-2) documentation")

public class PayoutMethodDetailsUSDBank {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

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

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bank_account_type";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private PayoutMethodBankAccountTypeEnum bankAccountType;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_SWIFT_CODE = "swift_code";
  @SerializedName(SERIALIZED_NAME_SWIFT_CODE)
  private String swiftCode;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_TRANSFER_REASON = "transfer_reason";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REASON)
  private PayoutMethodTransferReasonEnum transferReason;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PayoutMethodCountryEnum country;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

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

  public PayoutMethodDetailsUSDBank middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PayoutMethodDetailsUSDBank bankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * Get bankAccountType
   * @return bankAccountType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodBankAccountTypeEnum getBankAccountType() {
    return bankAccountType;
  }

  public void setBankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
  }

  public PayoutMethodDetailsUSDBank bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PayoutMethodDetailsUSDBank routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @ApiModelProperty(value = "")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public PayoutMethodDetailsUSDBank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Get swiftCode
   * @return swiftCode
  **/
  @ApiModelProperty(value = "")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public PayoutMethodDetailsUSDBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(value = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PayoutMethodDetailsUSDBank street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PayoutMethodDetailsUSDBank transferReason(PayoutMethodTransferReasonEnum transferReason) {
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

  public PayoutMethodDetailsUSDBank country(PayoutMethodCountryEnum country) {
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

  public PayoutMethodDetailsUSDBank birthDate(LocalDate birthDate) {
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
    PayoutMethodDetailsUSDBank payoutMethodDetailsUSDBank = (PayoutMethodDetailsUSDBank) o;
    return Objects.equals(this.firstName, payoutMethodDetailsUSDBank.firstName) &&
        Objects.equals(this.middleName, payoutMethodDetailsUSDBank.middleName) &&
        Objects.equals(this.lastName, payoutMethodDetailsUSDBank.lastName) &&
        Objects.equals(this.phoneNumber, payoutMethodDetailsUSDBank.phoneNumber) &&
        Objects.equals(this.bankCode, payoutMethodDetailsUSDBank.bankCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetailsUSDBank.bankAccount) &&
        Objects.equals(this.bankAccountType, payoutMethodDetailsUSDBank.bankAccountType) &&
        Objects.equals(this.bankName, payoutMethodDetailsUSDBank.bankName) &&
        Objects.equals(this.routingNumber, payoutMethodDetailsUSDBank.routingNumber) &&
        Objects.equals(this.swiftCode, payoutMethodDetailsUSDBank.swiftCode) &&
        Objects.equals(this.iban, payoutMethodDetailsUSDBank.iban) &&
        Objects.equals(this.street, payoutMethodDetailsUSDBank.street) &&
        Objects.equals(this.transferReason, payoutMethodDetailsUSDBank.transferReason) &&
        Objects.equals(this.country, payoutMethodDetailsUSDBank.country) &&
        Objects.equals(this.birthDate, payoutMethodDetailsUSDBank.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, phoneNumber, bankCode, bankAccount, bankAccountType, bankName, routingNumber, swiftCode, iban, street, transferReason, country, birthDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetailsUSDBank {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    transferReason: ").append(toIndentedString(transferReason)).append("\n");
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

