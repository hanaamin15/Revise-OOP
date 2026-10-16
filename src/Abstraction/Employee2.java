package Abstraction;

public class Employee2 extends Parent{
    int monthlyHours;
    public void PrintEmployeeSalary(){
        System.out.println("Employee Salary is:" +salary*monthlyHours);
    }
}
