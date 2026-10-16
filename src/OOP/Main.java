package OOP;

public class Main {
    public static void main(String[] args) {
        Restaurants restaurant1 = new Restaurants();
        restaurant1.name="Mac";
        restaurant1.address="New York";
        restaurant1.phone=9852;
        restaurant1.price=12.7;
        restaurant1.PrintInfo();

        Restaurants restaurant2 = new Restaurants();
        restaurant2.name="kfc";
        restaurant2.address="Chicago";
        restaurant2.phone=8765;
        restaurant2.price=10.5;
        restaurant2.PrintInfo();


        Restaurants restaurant3 = new Restaurants();
        restaurant3.name="Pizza Hut";
        restaurant3.address="Mexico";
        restaurant3.phone=5431;
        restaurant3.price=20.6;
        restaurant3.PrintInfo();


    }
}
