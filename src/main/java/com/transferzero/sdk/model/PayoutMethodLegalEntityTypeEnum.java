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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The entity type of the recipient.  For ZAR personal payouts valid options are: - &#x60;person&#x60;: Person  For ZAR business payouts valid options are: - &#x60;sole_proprietorship&#x60;: Sole Proprietorship - &#x60;privately_owned_company&#x60;: Privately Owned Company (Limited Company) - &#x60;publicly_owned_company&#x60;: Publicly Owned Company (PLC) - &#x60;government_owned_entity&#x60;: Government Owned Entity Trusts - &#x60;partnership&#x60;: Partnership - &#x60;go&#x60;: GO (Majority Owned Subsidiary of State-Owned Company) - &#x60;financial_institution&#x60;: Financial Institution
 */
@JsonAdapter(PayoutMethodLegalEntityTypeEnum.Adapter.class)
public enum PayoutMethodLegalEntityTypeEnum {
  
  PERSON("person"),
  
  SOLE_PROPRIETORSHIP("sole_proprietorship"),
  
  PRIVATELY_OWNED_COMPANY("privately_owned_company"),
  
  PUBLICLY_OWNED_COMPANY("publicly_owned_company"),
  
  GOVERNMENT_OWNED_ENTITY("government_owned_entity"),
  
  PARTNERSHIP("partnership"),
  
  GO("go"),
  
  FINANCIAL_INSTITUTION("financial_institution");

  private String value;

  PayoutMethodLegalEntityTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutMethodLegalEntityTypeEnum fromValue(String value) {
    for (PayoutMethodLegalEntityTypeEnum b : PayoutMethodLegalEntityTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutMethodLegalEntityTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutMethodLegalEntityTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutMethodLegalEntityTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutMethodLegalEntityTypeEnum.fromValue(value);
    }
  }
}

