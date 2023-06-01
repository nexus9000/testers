package edu.itstep.oop;

import java.io.Serializable;

public class Employee implements Person, Serializable {
    private final int id ;
    private final  String name;
    private final int age;
    private final int egn;
    private final  String sex;

    @Override
    public String getRole() {
        return null;
    }

    private final String occupation;

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }



    public String getOccupation() {
        return occupation;
    }



    @Override
    public void setPosition(String position) {

    }

    @Override
    public void printData() {
        System.out.println("Print by "+ Employee.class.getName());
    }

    public Employee(int id, String name, int age, String sex, String occupation){
        this.id = id;
        this.name = name;
        this.age = age;
        this.egn = Person.getEGN();
        this.sex = sex;
        this.occupation = occupation;
    }
   public void doWork(){
        System.out.println(this.name + " is working");
   }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    String getName(String lastName){
        return this.name + lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
