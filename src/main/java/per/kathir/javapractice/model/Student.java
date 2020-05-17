package per.kathir.javapractice.model;

import lombok.Data;

@Data
public class Student {
  
  private long id;
  private String firstName;
  private String lastName;
  private String rollNo;
  private String city;
  private String emailAddress;
  private int totalMarks;

}
