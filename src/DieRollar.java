import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        boolean continuePlaying = true;

        while (continuePlaying) {
            int rollCount = 0;
            int die1, die2, die3;

            // Header for the table [cite: 73]
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            do {
                rollCount++;
                die1 = gen.nextInt(6) + 1; // 1-6 [cite: 65]
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print table row [cite: 68]
                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3)); // Throw until triple [cite: 66]

            System.out.print("\nTriple reached! Do you want to roll again? [Y/N]: ");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("N")) {
                continuePlaying = false;
            }
        }
        System.out.println("Program exited.");
    }
}