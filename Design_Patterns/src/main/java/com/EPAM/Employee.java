package com.EPAM;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int sal;
   private List<Employee> employees;

   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.sal = sal;
      employees = new ArrayList<Employee>();
   }

   public void addEmp(Employee e) {
      employees.add(e);
   }

   public void removeEmp(Employee e) {
      employees.remove(e);
   }

   public List<Employee> getEmployees(){
     return employees;
   }

   public String toString(){
      return ("Employee :( Name : " + name + ", dept : " + dept + ", salary :" + sal+" )");
   }   
}
