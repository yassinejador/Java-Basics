public class AnonymousClass {
    public static void main(String[] args) {
        //You Create Only one Object from AnonymousClass.
        //Extend from Dog Class.
        Dog singleObject=new Dog() {
            @Override
            public void move() {
                System.out.println("tak tak tak ~");
            }
        };
        //Implement from AnimalSound interface.
        AnimalSound singleObjectSound=new AnimalSound() {
            @Override
            public void sound() {
                System.out.println("hao hao");
            }
        };

        singleObject.move();
        singleObjectSound.sound();
        singleObjectSound.honk();
    }
}