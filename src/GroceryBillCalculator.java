import java.util.Scanner;

public class GroceryBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coupon amount (as a decimal, e.g., .10): ");
        double couponAmount = scanner.nextDouble();

        if (couponAmount <= 0 || couponAmount > 1) {
            couponAmount = 0.10;
        }

        double[] weeklyBills = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the grocery bill for week " + (i + 1) + ": ");
            weeklyBills[i] = scanner.nextDouble();
        }

        double totalMonthlyBill = 0;
        for (double bill : weeklyBills) {
            totalMonthlyBill += bill;
        }
        double averageWeeklyBill = totalMonthlyBill / 4;

        double totalMonthlyBillWithCoupon = totalMonthlyBill * (1 - couponAmount);
        double averageWeeklyBillWithCoupon = totalMonthlyBillWithCoupon / 4;

        System.out.println("Total monthly bill without coupon: $" + totalMonthlyBill);
        System.out.println("Average weekly bill without coupon: $" + averageWeeklyBill);
        System.out.println("Total monthly bill with coupon: $" + totalMonthlyBillWithCoupon);
        System.out.println("Average weekly bill with coupon: $" + averageWeeklyBillWithCoupon);

        scanner.close();
    }
}

