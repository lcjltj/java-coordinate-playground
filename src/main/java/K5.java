public class K5 extends Car {
    public static final String NAME = "K5";
    private final int LITER = 13;
    private int distance;
    private String name;

    public K5(final int distance) {
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
