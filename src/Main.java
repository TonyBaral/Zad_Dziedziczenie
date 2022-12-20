
public class Main {
    public static void main(String[] args) {
        ElektricCar car1 = new ElektricCar("Tesla","biały",78);
        FuelCar car2 = new FuelCar("BMW","czarny",54);
        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());

        System.out.println();

Apple apple = new Apple("Jabłko");
Pinneapple pinneapple = new Pinneapple("Ananas");
Strawberry strawberry = new Strawberry("Truszkawka");

String[] fruitTable = {apple.nazwa, pinneapple.nazwa, strawberry.nazwa};

        for (String x : fruitTable) {System.out.println(x);}











    }
}