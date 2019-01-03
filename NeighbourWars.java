import java.util.Scanner;

public class NeighbourWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Peshodamage = Integer.parseInt(scanner.nextLine());
        int Goshodamage = Integer.parseInt(scanner.nextLine());

        int PeshoHealth = 100;
        int GoshoHealth = 100;

        boolean isPeshoAlive = true;
        boolean isGoshoAlive = true;

        int roundsCount = 0;

        while (isPeshoAlive && isGoshoAlive) {
            roundsCount++;

            if (roundsCount % 2 == 1) {
                GoshoHealth -= Peshodamage;
                if (GoshoHealth <= 0) {
                    isGoshoAlive = false;
                    continue;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", GoshoHealth);
            } else {
                PeshoHealth -= Goshodamage;
                if (PeshoHealth <= 0) {
                    isPeshoAlive = false;
                    continue;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", PeshoHealth);
            }
            if(roundsCount % 3 == 0){
                PeshoHealth += 10;
                GoshoHealth += 10;
            }
        }
        if (isPeshoAlive){
            System.out.printf("Pesho won in %dth round.%n", roundsCount);
        }
        else {
            System.out.printf("Gosho won in %dth round.", roundsCount);
        }
    }
}
