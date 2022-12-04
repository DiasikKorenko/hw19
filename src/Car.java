import java.util.Objects;
public class Car implements Cloneable {
    String model = "bmv";
    int cost = 85000;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cost == car.cost && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark car = '" + model + '\'' +
                "cost = " + cost + "$" +
                '}';
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
