package com.Employee.projectEmp;

import java.util.List;

public interface EmployeeService {

  String createEmployee(Employee employee);  // create 
  List<Employee> readEmployees();  // read
  boolean deleteEmployee(long id);
  String updateEmployee(Long id , Employee employee);
  Employee readEmployee(Long id);
} 
