public class FuelCar extends Car {
    int iloscPaliwa;

    public FuelCar(String markaSamochodu, String kolor, int iloscPaliwa) {
        super(markaSamochodu, kolor);
        this.iloscPaliwa = iloscPaliwa;
    }
    public String getInfo() {
        return "Spalinowe Auto: " + "[ marka: " + markaSamochodu + " kolor: " + kolor + " ilość paliwa:" + iloscPaliwa + "% ]";
    }
}

