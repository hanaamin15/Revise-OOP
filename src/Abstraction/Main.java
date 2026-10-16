package Abstraction;

public class Main {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.id=345;
        e1.name="Aliaa";
        e1.PrintEmployeeInfo();
        e1.salary=5000;
        e1.weeklyHours=50;
        e1.PrintEmployeeSalary();

        Employee2 e2 = new Employee2();
        e2.id=176;
        e2.name="Laila";
        e2.PrintEmployeeInfo();
        e2.salary=2000;
        e2.monthlyHours=120;
        e2.PrintEmployeeSalary();
    }
}
