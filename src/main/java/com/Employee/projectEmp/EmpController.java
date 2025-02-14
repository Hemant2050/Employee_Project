package com.Employee.projectEmp;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class EmpController {
    
   // EmployeeService employeeService =new EmployeeServiceImpl();
    @Autowired
    EmployeeService employeeService; // Dependcy Injection 

    @GetMapping("employees")

    public List<Employee> getAllEmployees() {
        
        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")

    public Employee getEmployeeById(@PathVariable Long id) {
        
        return employeeService.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return "Saved Succesfully";
    }
    
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable long id){
        if(employeeService.deleteEmployee(id)){
            return "Employee Deleted";
        }
        return "Not Found";

    }    

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        
        
        return employeeService.updateEmployee(id, employee);    
    }
}
