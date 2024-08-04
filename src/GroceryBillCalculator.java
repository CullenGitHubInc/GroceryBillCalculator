import java.util.Scanner;

public class GroceryBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for coupon amount
        System.out.print("Enter the coupon amount (as a decimal, e.g., .10): ");
        double couponAmount = scanner.nextDouble();

        // Ensure coupon amount is between 0 and 1
        if (couponAmount <= 0 || couponAmount > 1) {
            couponAmount = 0.10;
        }

        // Prompt the user for weekly grocery bills
        double[] weeklyBills = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the grocery bill for week " + (i + 1) + ": ");
            weeklyBills[i] = scanner.nextDouble();
        }

        // Calculate total monthly and average weekly bills without coupon
        double totalMonthlyBill = 0;
        for (double bill : weeklyBills) {
            totalMonthlyBill += bill;
        }
        double averageWeeklyBill = totalMonthlyBill / 4;

        // Calculate total monthly and average weekly bills with coupon
        double totalMonthlyBillWithCoupon = totalMonthlyBill * (1 - couponAmount);
        double averageWeeklyBillWithCoupon = totalMonthlyBillWithCoupon / 4;

        // Display results
        System.out.println("Total monthly bill without coupon: $" + totalMonthlyBill);
        System.out.println("Average weekly bill without coupon: $" + averageWeeklyBill);
        System.out.println("Total monthly bill with coupon: $" + totalMonthlyBillWithCoupon);
        System.out.println("Average weekly bill with coupon: $" + averageWeeklyBillWithCoupon);

        scanner.close();
    }
}

