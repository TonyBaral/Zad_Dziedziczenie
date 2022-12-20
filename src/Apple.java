public class Apple extends Fruit{

    public Apple(String nazwa) {
        super(nazwa);
    }

    @Override
    public String getName() {
        return "Apple{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}

