import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Number to divide : ");
            int x = scanner.nextInt();
            System.out.println("Number to divide by : ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("Result is :" + z);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatch Exception!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            scanner.close();
            System.out.println("This Always Print ");
        }
    }
}