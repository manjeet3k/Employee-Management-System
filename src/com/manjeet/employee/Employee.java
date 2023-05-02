package com.manjeet.employee;

public class Employee implements Company{
    private int empId;
    private String firstName;
    private String secondName;
    private  int joiningYear;

    public Employee(int empId, String firstName, String secondName, int joiningYear) {
        this.empId = empId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.joiningYear = joiningYear;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }
}
