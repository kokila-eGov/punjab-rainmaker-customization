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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * minimal representation of the Roles in the system to be carried along in UserInfo with RequestHeader meta data. Actual authorization service to extend this to have more role related attributes
 */
public class Primaryrole {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("description")
  private String description = null;

  public Primaryrole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unique name of the role
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Primaryrole code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Unique code of the role
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Primaryrole tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenantId for which the role is available
   * @return tenantId
  **/
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Primaryrole description(String description) {
    this.description = description;
    return this;
  }

   /**
   * brief description of the role
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Primaryrole primaryrole = (Primaryrole) o;
    return Objects.equals(this.name, primaryrole.name) &&
        Objects.equals(this.code, primaryrole.code) &&
        Objects.equals(this.tenantId, primaryrole.tenantId) &&
        Objects.equals(this.description, primaryrole.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, tenantId, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Primaryrole {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
