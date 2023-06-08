package com.example.springTest;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  private Integer employeeId;
  private String name;
  private String company;
  private String emailId;
}
