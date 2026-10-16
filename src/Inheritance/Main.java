package Inheritance;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model="Modern";
        chair.production="Turathna";
        chair.price=2000;
        chair.year=2015;
        chair.PrintFurnitureInfo();
        chair.PrintYear();
        chair.CalculateTotalPrice();

        Table table = new Table();
        table.model="Classic";
        table.production="OPI";
        table.price=3000;
        table.warranty=132;
        table.PrintFurnitureInfo();
        table.PrintWarranty();
        table.CalculateTotalPrice();
    }
}
