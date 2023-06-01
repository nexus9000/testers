package edu.itstep.oop;

public interface Person {
    String getName();

    String getRole();
    void setPosition(String position);
    int getAge();

    default void printData(){
        System.out.println("Printed by default method in interface");
    }

   static int getEGN(){
        return 75*32;
   }
}
