public class Cat extends Animal implements AnimalSound,SomeThingElse{
    @Override
    public void sound() {
        System.out.println("moaw");
    }

    @Override
    public void saySomeThing() {
        System.out.println("Hello im cat");
    }

    @Override
    public void move() {
        System.out.println("moving");
    }
}
