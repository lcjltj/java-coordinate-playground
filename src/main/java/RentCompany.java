import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private final List<Car> cars = new ArrayList<>();

    private RentCompany() {
    }

    public void addCar(final Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.joining("\n")) + "\n";
    }

    public static RentCompany create() {
        return new RentCompany();
    }
}
