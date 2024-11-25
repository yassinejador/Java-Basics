public interface Inter {
    abstract public int i();
    default void say() {
        System.out.println("hello");
    }
}
