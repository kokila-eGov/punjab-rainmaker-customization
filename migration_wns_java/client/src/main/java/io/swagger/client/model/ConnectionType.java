/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ConnectionType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T12:10:41.195Z[GMT]")
public class ConnectionType {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("active")
  private Boolean active = null;

  public ConnectionType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * code of the connection type
   * @return code
  **/
  @Schema(required = true, description = "code of the connection type")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ConnectionType active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether UsageCategoryMajor is Active or not.
   * @return active
  **/
  @Schema(description = "Whether UsageCategoryMajor is Active or not.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionType connectionType = (ConnectionType) o;
    return Objects.equals(this.code, connectionType.code) &&
        Objects.equals(this.active, connectionType.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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