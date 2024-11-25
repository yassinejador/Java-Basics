import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What's your name ?");
        String name=scanner.nextLine();

        System.out.println("how old are you :");
        int age =scanner.nextInt();
        scanner.nextLine();

        System.out.println("what's your favorite food :");
        String food =scanner.nextLine();

        System.out.println("hello :"+name);
        System.out.println("You are  :"+age);
        System.out.println("your favorite food :"+food);

        scanner.close();
    }
}
