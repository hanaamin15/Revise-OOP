package Inheritance;

public class Table extends Parent{

    //Attributes

    int warranty;

    //Method

    public void PrintWarranty(){
        System.out.println("warranty is:" + warranty);

    }

    @Override
    public void CalculateTotalPrice(){
        System.out.println("Total Salary is:"+price*warranty);
    }


}
