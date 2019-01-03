import java.util.Scanner;

public class VaporStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double spentMoney = 0;
        double remainingMoney = balance - spentMoney;

        while (balance > 0) {
            String games = scanner.nextLine();

            double game_Price = 0;
            switch (games) {
                case "OutFall 4":
                    game_Price += 39.99;
                    break;

                case "CS: OG":
                    game_Price = 15.99;
                    break;

                case "Zplinter Zell":
                    game_Price = 19.99;
                    break;

                case "Honored 2":
                    game_Price = 59.99;
                    break;

                case "RoverWatch":
                    game_Price = 29.99;
                    break;

                case "RoverWatch Origins Edition":
                    game_Price = 39.99;
                    break;

                case "Game Time":
                    System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, balance);
                    return;
                default:
                    System.out.println("Not Found");
                    continue;
            }
            if (balance >= game_Price) {
                System.out.printf("Bought %s%n", games);
                balance -= game_Price;
                spentMoney += game_Price;
            } else {
                System.out.println("Too Expensive");
            }
        }
        System.out.println("Out of money!");
    }
}
