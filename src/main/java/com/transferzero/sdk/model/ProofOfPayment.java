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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProofOfPayment
 */

public class ProofOfPayment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ProofOfPayment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the uploaded document
   * @return id
  **/
  @ApiModelProperty(value = "UUID of the uploaded document")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProofOfPayment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the uploaded file
   * @return fileName
  **/
  @ApiModelProperty(example = "my_file.jpg", value = "Name of the uploaded file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ProofOfPayment thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * URL to thumbnail image of the uploaded file
   * @return thumbnail
  **/
  @ApiModelProperty(example = "https://bitpesa-development.s3.eu-west-1.amazonaws.com/my_file_thumb.jpg", value = "URL to thumbnail image of the uploaded file")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ProofOfPayment url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to uploaded file
   * @return url
  **/
  @ApiModelProperty(example = "https://bitpesa-development.s3.eu-west-1.amazonaws.com/my_file.jpg", value = "URL to uploaded file")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProofOfPayment proofOfPayment = (ProofOfPayment) o;
    return Objects.equals(this.id, proofOfPayment.id) &&
        Objects.equals(this.fileName, proofOfPayment.fileName) &&
        Objects.equals(this.thumbnail, proofOfPayment.thumbnail) &&
        Objects.equals(this.url, proofOfPayment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, thumbnail, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofOfPayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
