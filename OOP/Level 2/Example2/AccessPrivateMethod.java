import java.lang.reflect.Method;

class RunClassAccessPrivateMethod {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("AccessPrivateMethod");
        Object o=c.newInstance();
        Method m=c.getDeclaredMethod("sayHello");
        m.setAccessible(true);
        m.invoke(o);
    }
}

class AccessPrivateMethod {
    private void sayHello() {
        System.out.println("Hello");
    }
}