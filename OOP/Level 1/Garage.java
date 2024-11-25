public class Garage {
    String nameOfCar;
    static int numberOfCars;

    Garage(Car car) {
        this.nameOfCar=car.name;
        numberOfCars++;
    }
    void park(Car car) {
        System.out.println("The "+car.name+" is Parked in the Garage");
    }

    static void miuns() {
        numberOfCars--;
    }
}
