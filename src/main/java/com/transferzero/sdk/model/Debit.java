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
import com.transferzero.sdk.model.ValidationErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Debits are used to fund transactions from your internal TransferZero balance.
 */
@ApiModel(description = "Debits are used to fund transactions from your internal TransferZero balance.")

public class Debit {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TO_TYPE = "to_type";
  @SerializedName(SERIALIZED_NAME_TO_TYPE)
  private String toType;

  public static final String SERIALIZED_NAME_TO_ID = "to_id";
  @SerializedName(SERIALIZED_NAME_TO_ID)
  private UUID toId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_USD_AMOUNT = "usd_amount";
  @SerializedName(SERIALIZED_NAME_USD_AMOUNT)
  private Double usdAmount;

  public static final String SERIALIZED_NAME_RUNNING_BALANCE = "running_balance";
  @SerializedName(SERIALIZED_NAME_RUNNING_BALANCE)
  private Double runningBalance;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<ValidationErrorDescription>> errors = null;


  public Debit amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount to be debited from your account.  The \&quot;amount\&quot; parameter is optional - - if included, it must equal the amount required to fund the transaction. - if omitted, it will default to the amount required to fund the transaction. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "The amount to be debited from your account.  The \"amount\" parameter is optional - - if included, it must equal the amount required to fund the transaction. - if omitted, it will default to the amount required to fund the transaction. ")

  public Double getAmount() {
    return amount;
  }



  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public Debit currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the amount in 3-character alpha ISO 4217 currency format.  The \&quot;currency\&quot; parameter is optional - if omitted, it will default to the payin currency of the transaction. - it can be added in as an additional check to ensure that the expected currency is used. (an error will be given back if it does not match up with the payin currency of the transaction) 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NGN", value = "The currency of the amount in 3-character alpha ISO 4217 currency format.  The \"currency\" parameter is optional - if omitted, it will default to the payin currency of the transaction. - it can be added in as an additional check to ensure that the expected currency is used. (an error will be given back if it does not match up with the payin currency of the transaction) ")

  public String getCurrency() {
    return currency;
  }



  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Debit toType(String toType) {
    
    this.toType = toType;
    return this;
  }

   /**
   * Describes what the debit is funding
   * @return toType
  **/
  @ApiModelProperty(example = "Transaction", required = true, value = "Describes what the debit is funding")

  public String getToType() {
    return toType;
  }



  public void setToType(String toType) {
    this.toType = toType;
  }


  public Debit toId(UUID toId) {
    
    this.toId = toId;
    return this;
  }

   /**
   * The ID of the resource the debit is funding
   * @return toId
  **/
  @ApiModelProperty(example = "5f44026b-7904-4c30-87d6-f8972d790ded", required = true, value = "The ID of the resource the debit is funding")

  public UUID getToId() {
    return toId;
  }



  public void setToId(UUID toId) {
    this.toId = toId;
  }


  public Debit metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of account debit
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "Metadata of account debit")

  public Object getMetadata() {
    return metadata;
  }



  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5f44026b-7904-4c30-87d6-f8972d790ded", value = "")

  public UUID getId() {
    return id;
  }




   /**
   * Date and time that the debit was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time that the debit was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The amount to be debited from your account converted to USD 
   * @return usdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200.06211683187206", value = "The amount to be debited from your account converted to USD ")

  public Double getUsdAmount() {
    return usdAmount;
  }




   /**
   * The total amount remaining in your account after the debit call 
   * @return runningBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000000", value = "The total amount remaining in your account after the debit call ")

  public Double getRunningBalance() {
    return runningBalance;
  }




   /**
   * The fields that have some problems and don&#39;t pass validation
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"phone_number\":[{\"error\":\"invalid\"}],\"documents\":[{\"error\":\"blank\"}]}", value = "The fields that have some problems and don't pass validation")

  public Map<String, List<ValidationErrorDescription>> getErrors() {
    return errors;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Debit debit = (Debit) o;
    return Objects.equals(this.amount, debit.amount) &&
        Objects.equals(this.currency, debit.currency) &&
        Objects.equals(this.toType, debit.toType) &&
        Objects.equals(this.toId, debit.toId) &&
        Objects.equals(this.metadata, debit.metadata) &&
        Objects.equals(this.id, debit.id) &&
        Objects.equals(this.createdAt, debit.createdAt) &&
        Objects.equals(this.usdAmount, debit.usdAmount) &&
        Objects.equals(this.runningBalance, debit.runningBalance) &&
        Objects.equals(this.errors, debit.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, toType, toId, metadata, id, createdAt, usdAmount, runningBalance, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Debit {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    toType: ").append(toIndentedString(toType)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    usdAmount: ").append(toIndentedString(usdAmount)).append("\n");
    sb.append("    runningBalance: ").append(toIndentedString(runningBalance)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

