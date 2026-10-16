package Constructors;

public class Restaurants {

    //Attributes

    String name;
    String address;
    int phone;
    double price;
    static int counter=0;


    //Method

    public void PrintInfo(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("Price: "+price);
        System.out.println("Number of object: "+counter);
    }
    public static void NumberOfObjects(){
        System.out.println("Total number of objects: "+counter);
    }


    //Default Constructor

    public Restaurants(){
        counter++;


    }



    //Parameterized Constructor
    public Restaurants(String name, String address, int phone, double price) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.price = price;
        counter++;
    }
}
