/*
 * Aces Encoded Listener API
 * API Specification for Encoded Listeners that read data on a blockchain and forward transaction events to registered subscribers. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * SubscriptionEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T23:56:49.035-07:00")
public class SubscriptionEvent {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    
    DELIVERED("delivered"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("tries")
  private Integer tries = null;

  @SerializedName("data")
  private String data = null;

  public SubscriptionEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Subscription Event identifier
   * @return id
  **/
  @ApiModelProperty(value = "Subscription Event identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date the Subscription Event was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Date the Subscription Event was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SubscriptionEvent status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SubscriptionEvent tries(Integer tries) {
    this.tries = tries;
    return this;
  }

   /**
   * Get tries
   * @return tries
  **/
  @ApiModelProperty(value = "")
  public Integer getTries() {
    return tries;
  }

  public void setTries(Integer tries) {
    this.tries = tries;
  }

  public SubscriptionEvent data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Event data encoded as a Json string.
   * @return data
  **/
  @ApiModelProperty(value = "Event data encoded as a Json string.")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEvent subscriptionEvent = (SubscriptionEvent) o;
    return Objects.equals(this.id, subscriptionEvent.id) &&
        Objects.equals(this.createdAt, subscriptionEvent.createdAt) &&
        Objects.equals(this.status, subscriptionEvent.status) &&
        Objects.equals(this.tries, subscriptionEvent.tries) &&
        Objects.equals(this.data, subscriptionEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, tries, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tries: ").append(toIndentedString(tries)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
