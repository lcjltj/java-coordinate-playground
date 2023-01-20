public class Sonata extends Car {
    public static final String NAME = "Sonata";
    private final int LITER = 10;

    private int distance;
    private String name;

    public Sonata(final int distance) {
        this.name = NAME;
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return LITER;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + String.format("%.0f", getChargeQuantity()) + "리터";
    }
}
