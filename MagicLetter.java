import java.util.Scanner;

public class MagicLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char invalidChar = scanner.nextLine().charAt(0);

        for (char i = startLetter; i <= endLetter; i++) {
            if (i == invalidChar) {
                continue;
            }
            for (char j = startLetter; j <= endLetter; j++) {
                if (j == invalidChar) {
                    continue;
                }
                for (char k = startLetter; k <= endLetter; k++) {
                    if (k == invalidChar) {
                        continue;
                    }
                    System.out.print(" " + i + j + k);
                }
            }
        }
    }
}
