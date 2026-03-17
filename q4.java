import java.util.Scanner;

class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] freq = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Display frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}