package com.Employee.projectEmp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private long id;
    private String name ;
    private String phoneNo;
    private String email;

  
}