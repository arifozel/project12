import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            i = scan.nextInt();
            if ( i % 2 == 1) {
                total += i;
            }

        } while ( i > 0);
        System.out.println("Toplam : " + total);

    }
}