package org.example.AnkitCode99.SingleResponsibility.BadDesign;

import java.math.BigInteger;
import java.util.Date;

public class Employee {

    private BigInteger empId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public BigInteger getEmpId() {
        return empId;
    }

    public void setEmpId(BigInteger empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isEligibleForPromotion(){

        // computation logic

        return true;
    }

    public double calculateIncomeTax(){
        // computation logic

        return 0.0;
    }

}

/**
* However, Employee class breaks the Single Responsibility Principle. Let's see how –
 *
 *
 * The logic of determining whether the employee is due this year is actually not a responsibility which the employee owns.
 * The company’s HR department owns this responsibility based on the company’s HR policies which may change every few years. On any such change in HR policies,
 * the Employee class will need to be updated as it is currently has the responsibility of promotion determination.
 *
 * Similarly, income tax calculation is not a responsibility of the Employee.
 * It is the finance department’s responsibility which it takes care of the current tax structure which may get updated every year.
 * If Employee class owns the income tax calculation responsibility then whenever tax structure/calculations change Employee class will need to be changed.
 *
 * Lastly, Employee class should have the single responsibility of maintaining core attributes of an employee.
* */
