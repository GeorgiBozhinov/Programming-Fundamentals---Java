import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstRow = n;

        int firstSymbols = (n - 1) / 2;
        int firstSpaces = n - 2;

        int L_spaces = 0;
        int R_spaces = 0;


        for (int i = 1; i <= firstSymbols; i++) {
            System.out.printf("%sx%sx%s%n",
                    print(" ", L_spaces),
                    print(" ", firstSpaces),
                    print(" ", R_spaces));
            L_spaces++;
            R_spaces++;

            firstSpaces -= 2;
        }

        int centreSpaces = (n - 1) / 2;
        System.out.printf("%sx%s",
                print(" ", centreSpaces),
                print(" ", centreSpaces));

        int bottomSpaces = (n - 3) / 2;
        int bottomCspaces = 1;


        for (int i = 1; i <= firstSymbols; i++) {
            System.out.printf("%n%sx%sx%s",
                    print(" ", bottomSpaces),
                    print(" ", bottomCspaces),
                    print(" ", bottomSpaces));
            bottomSpaces--;
            bottomCspaces += 2;
        }
    }

    private static String print(String text, int count) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < count; i++) {
            output.append(text);
        }
        return output.toString();
    }

}
