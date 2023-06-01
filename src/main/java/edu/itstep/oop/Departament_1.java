package edu.itstep.oop;

import java.util.ArrayList;
import java.util.HashMap;
public class Departament_1 extends Company implements Departament {
  private String nameDepartament;

  @Override
  public String getName(){
    return super.nameCompany + " " + nameDepartament;
  }

  private HashMap<Integer, Employee> listEmp;//key,value

  public Departament_1(){
    this.listEmp = new HashMap<>();
    Employee emp1 = new Employee(1, "John", 32,"male","worker");
    Employee emp2 = new Employee(2, "peter", 33,"male","worker");
    listEmp.put(emp1.getId(), emp1);
    listEmp.put(emp2.getId(), emp2);
  }
  private ArrayList<Employer> litsEmployer;
  public HashMap<Integer, Employee> getListEmp() {
    return listEmp;
  }
}
