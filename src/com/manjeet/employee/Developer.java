package com.manjeet.employee;

public class Developer extends Employee{

    private String speciality;


    public Developer(int empId, String firstName, String secondName, int joiningYear) {
        super(empId, firstName, secondName, joiningYear);
    }

    public Developer(int empId, String firstName, String secondName, int joiningYear, String speciality) {
        super(empId, firstName, secondName, joiningYear);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
