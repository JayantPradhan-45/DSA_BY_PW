public class HeartPattern {
    public static void main(String[] args) {
        int n = 6; // You can adjust the size of the heart by changing this value

        // Upper part of the heart
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // Lower part of the heart
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
