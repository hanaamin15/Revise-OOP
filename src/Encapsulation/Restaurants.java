package Encapsulation;

public class Restaurants {
    //Attributes

    private String name;
    private String address;
    private int phone;
    private double price;

    //Method


    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //Getter

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public double getPrice() {
        return price;
    }
}
