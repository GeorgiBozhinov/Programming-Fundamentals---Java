import java.util.Scanner;

public class IntervalOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for ( int i = n; i <= m; i++){
            System.out.println(i);
        }
        if ( n > m){
            for ( int i = m; i <= n; i++){
                System.out.println(i);
            }
        }
    }
}
