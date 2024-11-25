public class Car extends Vehicle{
    String version;
    String pub="jj";
    Car(String name,String color,String type,String version) {
        super(name, color, type);
        this.version=version;
    } 

    @Override
    void go() {
        System.out.println("the driver is driving the car");
    } 
    @Override
    void stop() {
        System.out.println("stop the car");
    } 
}
