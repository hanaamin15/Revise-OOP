package Constructors;

public class Main {
    public static void main(String[] args) {
        Restaurants restaurant1 = new Restaurants("Mac","New york", 1345,13.6);
        restaurant1.PrintInfo();
        Restaurants restaurant2 = new Restaurants("KFC","Chicago", 9871,10.9);
        restaurant2.PrintInfo();
        Restaurants restaurant3 = new Restaurants("Pizza Hut","Mexico", 6151,20.5);
        restaurant3.PrintInfo();

        Restaurants.NumberOfObjects();
    }
}
