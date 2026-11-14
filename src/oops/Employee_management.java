package oops;

public class Employee_management {
	String name;
    int id;
    double salary;
    void displayEmployee(String name,int id,double salary) {
    	this.name=name;
    	this.id=id;
    	this.salary=salary;
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }
}
