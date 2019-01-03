import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int Weekday = 0;
        int Weekend = 0;
        int Holiday = 0;

        if (age <= 0) {
            System.out.println("Error!");
        }

            if (age <= 18 & day.equals("Weekday")) {
                Weekday += 12;
                System.out.println(Weekday + "$");

            } else if (age <= 18 & day.equals("Weekend")) {
                Weekend += 15;
                System.out.println(Weekend + "$");

            } else if (age <= 18 & day.equals("Holiday")) {
                Holiday += 5;
                System.out.println(Holiday + "$");
            }


            if (age > 18 & age <= 64 & day.equals("Weekday")) {
                Weekday += 18;
                System.out.println(Weekday + "$");
            } else if (age > 18 & age <= 64 & day.equals("Weekend")) {
                Weekend += 20;
                System.out.println(Weekend + "$");
            } else if (age > 18 & age <= 64 & day.equals("Holiday")) {
                Holiday += 12;
                System.out.println(Holiday + "$");
            }

            if (age > 64 & age <= 122 & day.equals("Weekday")) {
                Weekday += 12;
                System.out.println(Weekday + "$");
            } else if (age > 64 & age <= 122 & day.equals("Weekend")) {
                Weekend += 15;
                System.out.println(Weekend + "$");
            } else if (age > 64 & age <= 122 & day.equals("Holiday")) {
                Holiday += 10;
                System.out.println(Holiday + "$");
            }


    }
}
