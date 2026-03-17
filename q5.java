import java.util.Scanner;

class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary, bonus = 0;
        int years;

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is: " + bonus);

        sc.close();
    }
}