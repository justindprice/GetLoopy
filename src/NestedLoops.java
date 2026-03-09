public class NestedLoops {
    public static void main(String[] args) {
        // Task 7: 5x5 Square (Suggested to do first) [cite: 38, 56]
        System.out.println("Task 7:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 5: Left-aligned Triangle [cite: 40]
        System.out.println("Task 5:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 6: Inverted Left-aligned Triangle [cite: 48]
        System.out.println("Task 6:");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}