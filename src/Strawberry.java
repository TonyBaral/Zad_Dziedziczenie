public class Strawberry extends Fruit{

    public Strawberry(String nazwa) {
        super(nazwa);
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
