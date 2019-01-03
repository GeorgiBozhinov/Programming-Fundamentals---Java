import java.util.Scanner;

public class CountTheIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while (true){
            String input = scanner.nextLine();

            try{
                int number = Integer.parseInt(input);
                counter++;
            }
            catch(NumberFormatException e){
                System.out.println(counter);
                break;
            }
        }
    }
}
