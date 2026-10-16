package Inheritance;

public class Chair extends Parent {

    //Attributes
    int year;

    //Method
    public void PrintYear() {
        System.out.println("year is " + year);
    }
    @Override
    public void CalculateTotalPrice(){
        System.out.println("Total Salary is"+price*year);
    }
}
