import java.util.Scanner;

public class SMStyping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String count = " ";

        for (int i = 1; i <= number; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            switch (n) {
                case 2:
                    count += "a";
                    break;
                case 22:
                    count += "b";
                    break;
                case 222:
                    count += "c";
                    break;
                case 3:
                    count += "d";
                    break;
                case 33:
                    count += "e";
                    break;
                case 333:
                    count += "f";
                    break;
                case 4:
                    count += "g";
                    break;
                case 44:
                    count += "h";
                    break;
                case 444:
                    count += "i";
                    break;
                case 5:
                    count += "j";
                    break;
                case 55:
                    count += "k";
                    break;
                case 555:
                    count += "l";
                    break;
                case 6:
                    count += "m";
                    break;
                case 66:
                    count += "n";
                    break;
                case 666:
                    count += "o";
                    break;
                case 7:
                    count += "p";
                    break;
                case 77:
                    count += "q";
                    break;
                case 777:
                    count += "r";
                    break;
                case 7777:
                    count += "s";
                    break;
                case 8:
                    count += "t";
                    break;
                case 88:
                    count += "u";
                    break;
                case 888:
                    count += "v";
                    break;
                case 9:
                    count += "w";
                    break;
                case 99:
                    count += "x";
                    break;
                case 999:
                    count += "y";
                    break;
                case 9999:
                    count += "z";
                    break;
                case 0:
                    count += " ";
                    break;
            }
        }
        System.out.println(count);
    }
}
