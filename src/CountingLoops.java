public class CountingLoops {
    public static void main(String[] args) {
        // Task 1: Count up by 1 from 0 to 30 [cite: 24]
        System.out.println("Task 1:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 2: Count down by 1 from 30 to 0 [cite: 27]
        System.out.println("Task 2:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 3: Count up by 3 from 0 to 18 [cite: 30]
        System.out.println("Task 3:");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 4: Count down by 2 from 10 to 0 [cite: 33]
        System.out.println("Task 4:");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}