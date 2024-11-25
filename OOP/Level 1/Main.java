public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Ferrari", "420", "yellow", 270000,"Italy");
        car1.infos();
        System.out.println();
        Car car2=new Car("Ferrari", "17.0.5", "red", 300000);
        car2.infos();
        Garage garage=new Garage(car2);
        garage.park(car2);

        //Array of Objects : 

        Car[] cars={car1,car2};
        //OR : Car[] cars=new Car[2];
        System.out.println(cars[0].country);
        System.out.println("number of car :"+Garage.numberOfCars);
    }
}
