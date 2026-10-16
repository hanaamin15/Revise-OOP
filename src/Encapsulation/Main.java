package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Restaurants restaurant1 = new Restaurants();
        restaurant1.setName("Mac");
        restaurant1.setAddress("New York");
        restaurant1.setPhone(98671);
        restaurant1.setPrice(50.5);
        System.out.println(restaurant1.getName());
        System.out.println(restaurant1.getAddress());
        System.out.println(restaurant1.getPhone());
        System.out.println(restaurant1.getPrice());
    }
}
