import java.util.ArrayList;
import java.util.Scanner;

public class NombreMonquant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] tab = { 1, 2, 4, 5, 6, 7,3 };
        System.out.print("donner n : ");
        n = scanner.nextInt();
        System.out.println(nombreM(n,tab));
    }

    public static boolean nombreM(int n, int[] tab) {
        boolean boo = false;
        int nombre = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] != 7) {
                for (int j = i + 1; j < n; j++) {
                    if (tab[i] + 1 == tab[j]) {
                        boo = true;
                        break;
                    } else {
                        nombre = tab[i] + 1;
                        boo = false;
                    }
                }
                if (boo == false) {
                    return boo;
                }
            }
        }
        return true;
    }
}