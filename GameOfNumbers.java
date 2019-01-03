import com.sun.javafx.tools.resource.ResourceFilter;

import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = m; i >= n; i--) {
            for (int j = m; j >= n; j--) {
                if (i + j == magicalNumber) {
                    System.out.printf("Number found! %d + %d = %d", n, m, magicalNumber);
                    return;
                } else {
                    count++;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magicalNumber);
    }
}

