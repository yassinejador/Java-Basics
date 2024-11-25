public class Bicycle extends Car{
    int model;
    Bicycle(String name,String color,String type,String version,int model) {
        super(name, color, type, version);
        this.model=model;
    }

    @Override
    void sound() {
        System.out.println("trrrrrrrrrr this sound the sound of Bicycle");
    } 

    public String toString() {
        return super.toString()+"\n"+this.type+"\n"+this.version+"\n"+this.model;
    }

    void copy(Car car) {
        // If you Wante To Copy An Object : 
    }

}
