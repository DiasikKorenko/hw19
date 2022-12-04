public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        Car newCar = car.clone();
        newCar.model = "Mers";
        System.out.println("Метод equals(): " + car.equals(newCar));
        System.out.println("Метод to String():\n" + car + "\n Метод to String() для копии:\n" + newCar);
        System.out.println("Метод HashCode():\n" +
                "car = " + car.hashCode() + "\n" +
                "newCar(после манипуляции над объектом) = " + newCar.hashCode());
    }
}