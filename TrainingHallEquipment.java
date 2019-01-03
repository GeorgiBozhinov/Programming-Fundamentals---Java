import java.util.Scanner;

public class TrainingHallEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int items = Integer.parseInt(scanner.nextLine());

        double subTotal = 0;

        for (int i = 1; i <= items; i++) {
            String itemName = scanner.nextLine();
            double itemPrice = Double.parseDouble(scanner.nextLine());
            int itemCount = Integer.parseInt(scanner.nextLine());

            double itemcount = itemPrice * itemCount;
            subTotal += itemcount;

            if ( itemCount > 1){
                System.out.printf("Adding %d %ss to cart.%n", itemCount, itemName);
            }else {
                System.out.printf("Adding %d %s to cart.%n", itemCount, itemName);
            }
        }
        double moneyLeft = Math.abs(budget - subTotal);

        if (subTotal > budget) {
            double calculation = Math.abs(subTotal - budget);
            System.out.printf("Subtotal: $%.2f%n", subTotal);
            System.out.printf("Not enough. We need $%.2f more.", calculation);
        } else {
            System.out.printf("Subtotal: $%.2f%n", subTotal);
            System.out.printf("Money left: $%.2f", moneyLeft);

        }
    }
}
