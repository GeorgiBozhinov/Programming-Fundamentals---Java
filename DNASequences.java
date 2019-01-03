import java.text.MessageFormat;
import java.util.Scanner;

public class DNASequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        A = 65; C = 67; G = 71; T = 84
        char[] dna = new char[]{'O', 'A', 'C', 'G', 'T', 'X'};

        int counter = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {

                    counter++;

                    if ((i + j + k) >= n) {
                        System.out.print(MessageFormat.format("{0}{1}{2}{3}{0} ", dna[0], dna[i], dna[j], dna[k]));
                    } else {
                        System.out.print(MessageFormat.format("{0}{1}{2}{3}{0} ", dna[5], dna[i], dna[j], dna[k]));
                    }

                    if (counter % 4 == 0) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
