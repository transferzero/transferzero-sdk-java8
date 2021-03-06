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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The cash provider for the pickup: For XOF valid options are: - &#x60;wizall&#x60;: Wizall
 */
@JsonAdapter(PayoutMethodCashProviderEnum.Adapter.class)
public enum PayoutMethodCashProviderEnum {
  
  WARI("wari"),
  
  WIZALL("wizall");

  private String value;

  PayoutMethodCashProviderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutMethodCashProviderEnum fromValue(String value) {
    for (PayoutMethodCashProviderEnum b : PayoutMethodCashProviderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutMethodCashProviderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutMethodCashProviderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutMethodCashProviderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutMethodCashProviderEnum.fromValue(value);
    }
  }
}

