package Abstraction;

public class Employee1 extends Parent{
    int weeklyHours;

    public void PrintEmployeeSalary(){
        System.out.println("Employee Salary is:" +salary*weeklyHours);
    }
}
