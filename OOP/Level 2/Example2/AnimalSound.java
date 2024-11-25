public interface AnimalSound {
    public void sound();
    default void honk() {
        System.out.println("Honk honk!");
    }
}
