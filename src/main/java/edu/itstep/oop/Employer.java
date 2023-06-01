package edu.itstep.oop;
//Employer is-A Person
public class Employer implements Person{
private int employeeId;
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getRole() {
        return null;
    }

    @Override
    public void setPosition(String position) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void printData() {
        Person.super.printData();
    }
}
