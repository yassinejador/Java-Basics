import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="y";
        while(name.isBlank()) {
            System.out.println("Your name :");
            name=scanner.next();
        }
        // The different is "do" execute at least once
        do {
            System.out.println("Your name :");
            name = scanner.next();
        } while (name.isBlank());
        
        for (int i = 10; i>=0; i-=2) {
            System.out.println(i);
        }
        System.out.println("hello :"+name);
        scanner.close();
    }
}