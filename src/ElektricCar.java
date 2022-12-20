public class ElektricCar extends Car {
    int pojemonoscBateri;

    public ElektricCar(String markaSamochodu, String kolor, int pojemonoscBateri) {
        super(markaSamochodu, kolor);
        this.pojemonoscBateri = pojemonoscBateri;
    }
    public String getInfo() {
        return"Elektyczne Auto: " + "[ marka: " + markaSamochodu + " kolor: " + kolor + " poziom naładowania:" + pojemonoscBateri + "% ]";
    }
}
