import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i += 2) {
            System.out.println(i);
        }
        System.out.println("------------");

        int total = 0;
        int piece = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                total += i;
                piece++;
            }
        }

        if (piece > 0) {
            double average = (double) total / piece;
            System.out.println("Average of numbers divisible by 4 = " + average);
        } else {
            System.out.println("No number divisible by 4.");
        }

    }
}