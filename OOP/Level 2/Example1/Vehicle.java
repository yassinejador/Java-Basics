public abstract class Vehicle{

    String name;
    String color;
    String type;
    Vehicle(String name,String color,String type) { // It might provide attributes or methods that are common to all Vehicle, like their name.
        this.name=name;
        this.color=color;
        this.type=type;
    }    

    abstract void go();  
    abstract void stop();   
    void sound() {
        System.out.println("annnnnnnn  this sound the sound of Vehicle");
    }    
    public String toString() {
        return this.name+"\n"+this.color+"\n"+this.type;
    }    
}