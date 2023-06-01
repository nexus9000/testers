package edu.itstep.run;

import edu.itstep.oop.Employee;

import java.util.HashMap;

public class RunApp {


    /**
     * @param arg
     */
    public static void main(String[] arg) {


//        Employee e1 = new Employee(1, "John", 32, "male", "worker");
//        Employee e2 = new Employee(2, "Peter", 33, "male", "worker");
//        Employee e3 = new Employee(3, "John", 30, "male", "worker");
//
//        HashMap<Integer, Employee> listEmployee = new HashMap<>();
//
//        listEmployee.put(e1.getId(), e1);
//        listEmployee.put(e2.getId(), e2);
//        listEmployee.put(e3.getId(), e3);
        //System.out.println(listEmployee.size());

        // listEmployee.forEach((k,v)-> System.out.println("key is: "+k + " value is: "+v));
        int[] array = {13, 33, -1, 44, 130, 222};
        //Employee[] emp = {e1, e2, e3};

        SearchEngine searchEngine = new SearchEngine();
        int result = searchEngine.linearSearch(33, array);
        if(result == 0)System.out.println("match found");
        else System.out.println("match doesn't found");
    }


}





