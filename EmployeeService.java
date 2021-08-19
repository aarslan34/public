package com.tcs.emplmngt.service;

import com.tcs.emplmngt.model.Employee;

public interface EmployeeService {

    public String addEmployee(Employee employee);
    public String updateEmployee(String empId, Employee employee);
    public String deleteEmployeeById(String id);
    public Employee getEmployeeById(String id);
    public Employee[] getEmployees();


}
