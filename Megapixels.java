import java.util.Scanner;

public class Megapixels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double megapixels =(width * height) / 1000000;

        System.out.printf("%.0fx%.0f => %.1fMP", width, height, megapixels);
    }
}
