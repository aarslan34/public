package com.tcs.emplmngt.model;



public class Employee {  // Object class will be a base class .
    // bcoz Object is a base class of everyone.


    public Employee() {
        // TODO Auto-generated constructor stub
        System.out.println("constructor executed");
    }
    // parameterized constructor: it is used to initialize the object based on user defined values.

    // basic pay + hra + ta + da -taxation
    /// hra : house rent allowance
    // ta  : travel allowance
    // da : dareness allowance
    public float calculateTax(float calculatedSalary) {
        // do we have taxation slabs
        // will you cross check with the slabs?
        // if we will allow to override this method then every type can define thier own stds for tax slabs.
        //
        return 0;
    }

    public final float calculateSalary() {
        // hra : 10% basic
        // ta : 15 % basic
        // da : 10% basic
        float hra = this.empSalary*0.1f;
        float ta = this.empSalary* 0.15f;
        float da = this.empSalary*0.1f;
        return this.empSalary + hra + ta + da;

    }

    private String employeeId;
    public Employee(String employeeId, String empFirstName, String empLastName) {
        super(); // i will give a call to base class constructor.
        // constructor from the Object class.

        this.employeeId = employeeId; // this will refer the current object.
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmpFirstName() {
        return empFirstName;
    }
    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }
    public String getEmpLastName() {
        return empLastName;
    }
    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }
    public float getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }



    private String empFirstName;
    private String empLastName;
    private float empSalary;

}
