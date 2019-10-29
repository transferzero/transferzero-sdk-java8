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
import com.transferzero.sdk.model.PayoutMethodDetailsBalance;
import com.transferzero.sdk.model.PayoutMethodDetailsGHSBank;
import com.transferzero.sdk.model.PayoutMethodDetailsIBAN;
import com.transferzero.sdk.model.PayoutMethodDetailsMADCash;
import com.transferzero.sdk.model.PayoutMethodDetailsMobile;
import com.transferzero.sdk.model.PayoutMethodDetailsNGNBank;
import com.transferzero.sdk.model.PayoutMethodDetailsXOFBank;
import com.transferzero.sdk.model.PayoutMethodDetailsXOFMobile;
import com.transferzero.sdk.model.PayoutMethodGenderEnum;
import com.transferzero.sdk.model.PayoutMethodIdentityCardTypeEnum;
import com.transferzero.sdk.model.PayoutMethodMobileProviderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutMethodDetails
 */

public class PayoutMethodDetails {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bank_account_type";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private PayoutMethodBankAccountTypeEnum bankAccountType;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PROVIDER = "mobile_provider";
  @SerializedName(SERIALIZED_NAME_MOBILE_PROVIDER)
  private PayoutMethodMobileProviderEnum mobileProvider;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_COUNTRY = "bank_country";
  @SerializedName(SERIALIZED_NAME_BANK_COUNTRY)
  private String bankCountry;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public static final String SERIALIZED_NAME_SENDER_IDENTITY_CARD_TYPE = "sender_identity_card_type";
  @SerializedName(SERIALIZED_NAME_SENDER_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum senderIdentityCardType;

  public static final String SERIALIZED_NAME_SENDER_IDENTITY_CARD_ID = "sender_identity_card_id";
  @SerializedName(SERIALIZED_NAME_SENDER_IDENTITY_CARD_ID)
  private String senderIdentityCardId;

  public static final String SERIALIZED_NAME_SENDER_CITY_OF_BIRTH = "sender_city_of_birth";
  @SerializedName(SERIALIZED_NAME_SENDER_CITY_OF_BIRTH)
  private String senderCityOfBirth;

  public static final String SERIALIZED_NAME_SENDER_COUNTRY_OF_BIRTH = "sender_country_of_birth";
  @SerializedName(SERIALIZED_NAME_SENDER_COUNTRY_OF_BIRTH)
  private String senderCountryOfBirth;

  public static final String SERIALIZED_NAME_SENDER_GENDER = "sender_gender";
  @SerializedName(SERIALIZED_NAME_SENDER_GENDER)
  private PayoutMethodGenderEnum senderGender;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_TYPE = "identity_card_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_TYPE)
  private PayoutMethodIdentityCardTypeEnum identityCardType;

  public static final String SERIALIZED_NAME_IDENTITY_CARD_ID = "identity_card_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CARD_ID)
  private String identityCardId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public PayoutMethodDetails firstName(String firstName) {
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

  public PayoutMethodDetails lastName(String lastName) {
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

  public PayoutMethodDetails bankCode(String bankCode) {
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

  public PayoutMethodDetails bankAccount(String bankAccount) {
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

  public PayoutMethodDetails bankAccountType(PayoutMethodBankAccountTypeEnum bankAccountType) {
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

  public PayoutMethodDetails phoneNumber(String phoneNumber) {
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

  public PayoutMethodDetails mobileProvider(PayoutMethodMobileProviderEnum mobileProvider) {
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

  public PayoutMethodDetails iban(String iban) {
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

  public PayoutMethodDetails bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PayoutMethodDetails bankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
    return this;
  }

   /**
   * Get bankCountry
   * @return bankCountry
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBankCountry() {
    return bankCountry;
  }

  public void setBankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
  }

  public PayoutMethodDetails bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public PayoutMethodDetails senderIdentityCardType(PayoutMethodIdentityCardTypeEnum senderIdentityCardType) {
    this.senderIdentityCardType = senderIdentityCardType;
    return this;
  }

   /**
   * Get senderIdentityCardType
   * @return senderIdentityCardType
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodIdentityCardTypeEnum getSenderIdentityCardType() {
    return senderIdentityCardType;
  }

  public void setSenderIdentityCardType(PayoutMethodIdentityCardTypeEnum senderIdentityCardType) {
    this.senderIdentityCardType = senderIdentityCardType;
  }

  public PayoutMethodDetails senderIdentityCardId(String senderIdentityCardId) {
    this.senderIdentityCardId = senderIdentityCardId;
    return this;
  }

   /**
   * Get senderIdentityCardId
   * @return senderIdentityCardId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSenderIdentityCardId() {
    return senderIdentityCardId;
  }

  public void setSenderIdentityCardId(String senderIdentityCardId) {
    this.senderIdentityCardId = senderIdentityCardId;
  }

  public PayoutMethodDetails senderCityOfBirth(String senderCityOfBirth) {
    this.senderCityOfBirth = senderCityOfBirth;
    return this;
  }

   /**
   * Get senderCityOfBirth
   * @return senderCityOfBirth
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSenderCityOfBirth() {
    return senderCityOfBirth;
  }

  public void setSenderCityOfBirth(String senderCityOfBirth) {
    this.senderCityOfBirth = senderCityOfBirth;
  }

  public PayoutMethodDetails senderCountryOfBirth(String senderCountryOfBirth) {
    this.senderCountryOfBirth = senderCountryOfBirth;
    return this;
  }

   /**
   * Get senderCountryOfBirth
   * @return senderCountryOfBirth
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSenderCountryOfBirth() {
    return senderCountryOfBirth;
  }

  public void setSenderCountryOfBirth(String senderCountryOfBirth) {
    this.senderCountryOfBirth = senderCountryOfBirth;
  }

  public PayoutMethodDetails senderGender(PayoutMethodGenderEnum senderGender) {
    this.senderGender = senderGender;
    return this;
  }

   /**
   * Get senderGender
   * @return senderGender
  **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethodGenderEnum getSenderGender() {
    return senderGender;
  }

  public void setSenderGender(PayoutMethodGenderEnum senderGender) {
    this.senderGender = senderGender;
  }

  public PayoutMethodDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PayoutMethodDetails identityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
    return this;
  }

   /**
   * Get identityCardType
   * @return identityCardType
  **/
  @ApiModelProperty(value = "")
  public PayoutMethodIdentityCardTypeEnum getIdentityCardType() {
    return identityCardType;
  }

  public void setIdentityCardType(PayoutMethodIdentityCardTypeEnum identityCardType) {
    this.identityCardType = identityCardType;
  }

  public PayoutMethodDetails identityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
    return this;
  }

   /**
   * Get identityCardId
   * @return identityCardId
  **/
  @ApiModelProperty(value = "")
  public String getIdentityCardId() {
    return identityCardId;
  }

  public void setIdentityCardId(String identityCardId) {
    this.identityCardId = identityCardId;
  }

  public PayoutMethodDetails reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDetails payoutMethodDetails = (PayoutMethodDetails) o;
    return Objects.equals(this.firstName, payoutMethodDetails.firstName) &&
        Objects.equals(this.lastName, payoutMethodDetails.lastName) &&
        Objects.equals(this.bankCode, payoutMethodDetails.bankCode) &&
        Objects.equals(this.bankAccount, payoutMethodDetails.bankAccount) &&
        Objects.equals(this.bankAccountType, payoutMethodDetails.bankAccountType) &&
        Objects.equals(this.phoneNumber, payoutMethodDetails.phoneNumber) &&
        Objects.equals(this.mobileProvider, payoutMethodDetails.mobileProvider) &&
        Objects.equals(this.iban, payoutMethodDetails.iban) &&
        Objects.equals(this.bankName, payoutMethodDetails.bankName) &&
        Objects.equals(this.bankCountry, payoutMethodDetails.bankCountry) &&
        Objects.equals(this.bic, payoutMethodDetails.bic) &&
        Objects.equals(this.senderIdentityCardType, payoutMethodDetails.senderIdentityCardType) &&
        Objects.equals(this.senderIdentityCardId, payoutMethodDetails.senderIdentityCardId) &&
        Objects.equals(this.senderCityOfBirth, payoutMethodDetails.senderCityOfBirth) &&
        Objects.equals(this.senderCountryOfBirth, payoutMethodDetails.senderCountryOfBirth) &&
        Objects.equals(this.senderGender, payoutMethodDetails.senderGender) &&
        Objects.equals(this.reason, payoutMethodDetails.reason) &&
        Objects.equals(this.identityCardType, payoutMethodDetails.identityCardType) &&
        Objects.equals(this.identityCardId, payoutMethodDetails.identityCardId) &&
        Objects.equals(this.reference, payoutMethodDetails.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, bankCode, bankAccount, bankAccountType, phoneNumber, mobileProvider, iban, bankName, bankCountry, bic, senderIdentityCardType, senderIdentityCardId, senderCityOfBirth, senderCountryOfBirth, senderGender, reason, identityCardType, identityCardId, reference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDetails {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    mobileProvider: ").append(toIndentedString(mobileProvider)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountry: ").append(toIndentedString(bankCountry)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    senderIdentityCardType: ").append(toIndentedString(senderIdentityCardType)).append("\n");
    sb.append("    senderIdentityCardId: ").append(toIndentedString(senderIdentityCardId)).append("\n");
    sb.append("    senderCityOfBirth: ").append(toIndentedString(senderCityOfBirth)).append("\n");
    sb.append("    senderCountryOfBirth: ").append(toIndentedString(senderCountryOfBirth)).append("\n");
    sb.append("    senderGender: ").append(toIndentedString(senderGender)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    identityCardType: ").append(toIndentedString(identityCardType)).append("\n");
    sb.append("    identityCardId: ").append(toIndentedString(identityCardId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

