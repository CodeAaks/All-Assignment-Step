import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Enter a year >= 1582 (Gregorian Calendar)");
        } 
        else {

            // Part 1: Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Leap Year (Method 1)");
            }
            else if (year % 100 == 0) {
                System.out.println("Not a Leap Year (Method 1)");
            }
            else if (year % 4 == 0) {
                System.out.println("Leap Year (Method 1)");
            }
            else {
                System.out.println("Not a Leap Year (Method 1)");
            }

            // Part 2: Using single if with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap Year (Method 2)");
            } 
            else {
                System.out.println("Not a Leap Year (Method 2)");
            }
        }

        sc.close();
    }
}