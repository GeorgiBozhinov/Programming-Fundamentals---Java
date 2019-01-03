import java.util.Scanner;

public class CharacterStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentHealth = Integer.parseInt(scanner.nextLine());
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        int currentEnergy = Integer.parseInt(scanner.nextLine());
        int maximumEnergy = Integer.parseInt(scanner.nextLine());

        System.out.printf("Name: %s", name);

        int healthDots = maximumHealth - currentHealth;
        int energyDots = maximumEnergy - currentEnergy;


        if (currentHealth < maximumHealth) {
            System.out.printf("%nHealth: |%s%s|",
                    print("|", currentHealth),
                    print(".", healthDots));
        } else if (currentHealth == maximumHealth) {
            System.out.printf("%nHealth: |%s|", print("|", maximumHealth));
        } else {
            System.out.printf("%nHealth: |%s|", print(".", healthDots));
        }

        if (currentEnergy < maximumEnergy) {
            System.out.printf("%nEnergy: |%s%s|",
                    print("|", currentEnergy),
                    print(".", energyDots));
        } else if (currentEnergy == maximumEnergy) {
            System.out.printf("%nEnergy: |%s|", print("|", maximumEnergy));
        } else {
            System.out.printf("%nEnergy: |%s|", print(".", energyDots));
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
