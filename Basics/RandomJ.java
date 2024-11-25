import java.util.Random;
public class RandomJ {
    public static void main(String[] args) {
        Random random = new Random();
        double x=random.nextDouble();
        System.out.println(x);

        int z=random.nextInt(6)+1;
        System.out.println(z);
        
        boolean y=random.nextBoolean();
        System.out.println(y);
    }
}
