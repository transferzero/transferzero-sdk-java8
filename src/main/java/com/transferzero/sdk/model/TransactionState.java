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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The state of the transaction, which can be one of the following:  * &#x60;initial&#x60;: Transaction is created, but not yet ready to receive payments (waiting for Sender to be KYC&#39;d and approved). * &#x60;approved&#x60;: Transaction is created and the sender is approved. Payment can be received * &#x60;pending&#x60;: There&#39;s an active collection to fund the transaction that needs to clear. * &#x60;received&#x60;: Transaction has received the correct payin amount and will start processing the payouts. * &#x60;mispaid&#x60;: Transaction received funds, but not the requested amount. The transaction will be resized, and will start payout based on the received funds. * &#x60;manual&#x60;: Some of the payments to the recipients have run into issues. Please check the recipient statuses for more information. * &#x60;paid&#x60;: Transaction has received correct payins and has performed payouts to all recipients. No further steps required * &#x60;canceled&#x60;: The transaction has been cancelled. Transactions are cancelled automatically after one hour if there was no funds received. Once transactions are funded they can be cancelled by the API user unless the recipients have been paid out. * &#x60;refunded&#x60;: The transaction has been cancelled after it has been funded, but the funds have been returned now to the sender either partially or fully. * &#x60;processing&#x60;: Transaction has received a payin, it&#39;s processing. * &#x60;exception&#x60;: An exception happened during the processing of the transaction. Please contact TransferZero
 */
@JsonAdapter(TransactionState.Adapter.class)
public enum TransactionState {
  
  INITIAL("initial"),
  
  APPROVED("approved"),
  
  PENDING("pending"),
  
  RECEIVED("received"),
  
  MISPAID("mispaid"),
  
  MANUAL("manual"),
  
  PAID("paid"),
  
  CANCELED("canceled"),
  
  REFUNDED("refunded"),
  
  PROCESSING("processing"),
  
  EXCEPTION("exception");

  private String value;

  TransactionState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionState fromValue(String value) {
    for (TransactionState b : TransactionState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionState.fromValue(value);
    }
  }
}

