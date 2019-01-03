import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int caloriesCounter = 0;

        for (int i = 1; i <= n; i++) {

            String ingredients = scanner.nextLine().toLowerCase();

            switch (ingredients) {
                case "cheese":
                    caloriesCounter += 500;
                    break;
                case "tomato sauce":
                    caloriesCounter += 150;
                    break;
                case "salami":
                    caloriesCounter += 600;
                    break;
                case "pepper":
                    caloriesCounter += 50;
                    break;
            }
        }
        System.out.printf("Total calories: %d", caloriesCounter);
    }
}
