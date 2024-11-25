import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your year :");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (!(year % 100 == 0) && year % 4 == 0)) {
            System.out.println("Leap year");
        } 
        else {
            System.out.println("Not Leap year");
        }
        scanner.close();
    }
}
