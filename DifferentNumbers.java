import java.util.Scanner;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        // n = 40
        // m = 46

        if (m - n < 5) {
            System.out.println("No");
        } else {
            for (int i = n; i <= m; i++) {
                for (int j = n; j <= m; j++) {
                    for (int k = n; k <= m; k++) {
                        for (int l = n; l <= m; l++) {
                            for (int p = n; p <= m; p++) {

                                if (j <= i || k <= j || l <= k || p <= l) continue;

                                else {
                                    System.out.print(i + " ");
                                    System.out.print(j + " ");
                                    System.out.print(k + " ");
                                    System.out.print(l + " ");
                                    System.out.println(p);
                                }

                            }

                        }
                    }
                }
            }
        }
    }
}
