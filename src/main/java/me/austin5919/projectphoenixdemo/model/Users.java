package me.austin5919.projectphoenixdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Users {
  @Id @GeneratedValue private Long userId;
  private String username;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String state;
  private boolean isAdmin;
  private String email;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private Timestamp joinDate;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private Timestamp lastOnline;

  public Users() {
    joinDate = new Timestamp(new Date().getTime());
  }
}
