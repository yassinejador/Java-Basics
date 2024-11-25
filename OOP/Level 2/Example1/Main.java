public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Ferrari","red","italy","7.7");
        Car bicycle1=new Bicycle("bike", "black", "usa", "77", 2);
        car1.go();
        car1.stop();
        System.out.println(bicycle1.pub);
    }
}
