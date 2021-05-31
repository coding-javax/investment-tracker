import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = input.nextDouble();
        int day = 1;
        double closingPrice;
        double[] weekly = new double[7];

        int i = 0;
        while (i < weekly.length) { // While Loop Begins - To get Closing Price each day
            System.out.println("Enter the closing price for the day " + day);
            closingPrice = input.nextDouble();
            double earnings = closingPrice - buyingPrice;
            weekly[i] = earnings;

            if (earnings > 0) {
                System.out.printf("After day " + day + " you have gained $%.2f" + " per share since yesterday.",
                        earnings);
                System.out.println(" ");
            } else if (earnings < 0) {
                System.out.printf("After day " + day + " you have lost $%.2f" + " per share since yesterday.",
                        (-earnings));
                System.out.println(" ");
            } else {
                System.out.println("After day " + day + ", you have no earnings per share");
            }
            day = day + 1;
            i = i + 1;
        } // While Loop Ends - To get Closing Price each day

        System.out.println("Your weekly earnings:");
        double totalWeeklyEarnings = 0;
        for (int j = 0; j < weekly.length; j++) {
            System.out.printf("Your earning on day " + j + " is $%.2f", weekly[j]);
            System.out.println(" ");
            totalWeeklyEarnings = totalWeeklyEarnings + weekly[j];
        }
        System.out.printf("Total earnings: " + "$%.2f" + " per share", totalWeeklyEarnings);
        input.close();
    }
}
