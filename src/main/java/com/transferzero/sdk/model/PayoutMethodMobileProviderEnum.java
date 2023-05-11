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
 * The Mobile Wallet provider of the recipient:  For XOF (Senegal) valid options are: - &#x60;orange&#x60;: Orange - &#x60;tigo&#x60;: Tigo - &#x60;emoney&#x60;: Emoney - &#x60;free&#x60;: Free - &#x60;wave&#x60;: Wave - &#x60;expresso&#x60; : Expresso  For XOF (Ivory Coast) valid options are: - &#x60;orange&#x60;: Orange - &#x60;moov&#x60;: Moov - &#x60;mtn&#x60;: MTN  For XOF (Burkina Faso) valid options are: - &#x60;orange&#x60;: Orange - &#x60;mobicash&#x60;: Mobicash - &#x60;moov&#x60; : Moov  For XOF (Togo) valid options are: - &#x60;moov&#x60;: Moov - &#x60;tmoney&#x60;: Tmoney  For XOF (Benin) valid options are: - &#x60;moov&#x60;: Moov - &#x60;mtn&#x60;: Mtn  For XOF (Mali) valid options are: - &#x60;orange&#x60;: Orange - &#x60;mobicash&#x60;: Mobicash - &#x60;tigo&#x60; : Tigo  For GHS valid options are: - &#x60;mtn&#x60;: MTN - &#x60;airtel&#x60;: Airtel - &#x60;tigo&#x60;: Tigo - &#x60;vodafone&#x60;: Vodafone  For KES valid options are: - &#x60;mpesa&#x60;: MPESA  For UGX valid options are: - &#x60;africell&#x60;: Africell - &#x60;airtel&#x60;: Airtel - &#x60;mtn&#x60;: MTN - &#x60;telecom&#x60;: Telecom  For XAF (Cameroon) valid options are: - &#x60;orange&#x60;: Orange - &#x60;mtn&#x60;: MTN  For GNF (Guinea) valid options are: - &#x60;orange&#x60;: Orange - &#x60;mtn&#x60;: MTN
 */
@JsonAdapter(PayoutMethodMobileProviderEnum.Adapter.class)
public enum PayoutMethodMobileProviderEnum {
  
  ORANGE("orange"),
  
  TIGO("tigo"),
  
  MOOV("moov"),
  
  MTN("mtn"),
  
  AIRTEL("airtel"),
  
  VODAFONE("vodafone"),
  
  MPESA("mpesa"),
  
  AFRICELL("africell"),
  
  TELECOM("telecom"),
  
  MOBICASH("mobicash"),
  
  EMONEY("emoney"),
  
  FREE("free"),
  
  WAVE("wave"),
  
  EXPRESSO("expresso"),
  
  TMONEY("tmoney");

  private String value;

  PayoutMethodMobileProviderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutMethodMobileProviderEnum fromValue(String value) {
    for (PayoutMethodMobileProviderEnum b : PayoutMethodMobileProviderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutMethodMobileProviderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutMethodMobileProviderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutMethodMobileProviderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutMethodMobileProviderEnum.fromValue(value);
    }
  }
}

