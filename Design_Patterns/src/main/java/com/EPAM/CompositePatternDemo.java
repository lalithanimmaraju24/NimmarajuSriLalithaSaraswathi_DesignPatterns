package com.EPAM;

public class CompositePatternDemo {
	   public static void main(String[] args) {
	   
	      Employee CEO = new Employee("Ram","CEO", 30000);
	      Employee headOfSales = new Employee("Ravi","Head Sales", 20000);
	      Employee headOfMarketing = new Employee("Rohan","Head Marketing", 20000);
	      Employee clerk1 = new Employee("Rahul","Marketing", 10000);
	      Employee clerk2 = new Employee("Ritu","Marketing", 10000);
	      Employee salesExecutive1 = new Employee("Rohit","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Robin","Sales", 10000);

	      CEO.addEmp(headOfSales);
	      CEO.addEmp(headOfMarketing);

	      headOfSales.addEmp(salesExecutive1);
	      headOfSales.addEmp(salesExecutive2);

	      headOfMarketing.addEmp(clerk1);
	      headOfMarketing.addEmp(clerk2);

	      System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getEmployees()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getEmployees()) {
	            System.out.println(employee);
	         }
	      }		
	   }
	}