package Inheritance;

public class Parent {

    //Attributes

    int price;
    String model;
    String production;

    //Method

    public void PrintFurnitureInfo(){
        System.out.println("price is " + price);
        System.out.println("model is " + model);
        System.out.println("production is " + production);


    }

    //Overriding
    public void CalculateTotalPrice(){

    }
}
