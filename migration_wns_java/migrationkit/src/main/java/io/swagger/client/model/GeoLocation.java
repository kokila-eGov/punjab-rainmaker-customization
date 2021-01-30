/*
 * eGov Property Registry System.
 * APIs for Property Registry module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * GeoLocation
 */

public class GeoLocation {
  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  @JsonProperty("additionalDetails")
  private Object additionalDetails = null;

  public GeoLocation latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * latitude of the address
   * @return latitude
  **/
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public GeoLocation longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * longitude of the address
   * @return longitude
  **/
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public GeoLocation additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Json object to capture any extra information which is not accommodated by model
   * @return additionalDetails
  **/
  public Object getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.latitude, geoLocation.latitude) &&
        Objects.equals(this.longitude, geoLocation.longitude) &&
        Objects.equals(this.additionalDetails, geoLocation.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, additionalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
