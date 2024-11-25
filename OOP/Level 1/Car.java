public class Car {
    String name;
    String version;
    String color;
    float price;
    String country;

    Car(String name,String version,String color,float price,String country) {
        this.name=name;
        this.version=version;
        this.color=color;
        this.price=price;
        this.country=country;
    }
    // Overloaded Constructor
    Car(String name,String version,String color,float price) {
        this.name=name;
        this.version=version;
        this.color=color;
        this.price=price;
    }
    void infos() {
        System.out.println("name is :"+this.name);
        System.out.println("version is :"+this.version);
        System.out.println("color is :"+this.color);
        System.out.println("price is :"+this.price);
        if(this.country!=null ) System.out.println("country is :"+this.country);
    }

    // We can use toString method to represents (Textually) this objet

    public String toString() {
        return this.name+"\n"+this.version+"\n"+this.color+"\n"+this.price;
    }
}