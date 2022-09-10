package com.javabasic;


public class Employee {

    private Integer Id;
    private String firstName;
    private String lastName;
    int dob;

    public Employee(Integer id, String firstName, String lastName, int dob) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee ID=" + Id + " " + firstName + " " + lastName + " " + dob ;
    }
}
