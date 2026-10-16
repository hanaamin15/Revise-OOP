package Abstraction;

public abstract class Parent {

    //Attributes

    int  id;
    String name;
    int  salary;


    //Method
    public void PrintEmployeeInfo(){
        System.out.println("Employee id is :" +id);
        System.out.println("Employee name is :" + name);

    }

    public abstract void PrintEmployeeSalary();

}
