package codewars;

public class DailyRental {

    public static void main(String[] args) {
        System.out.println(calculateTotalCost(7));
    }

    public static int calculateTotalCost(int days) {
        if (days <= 0) {
            return 0;
        }
        int dailyRate = 40;
        int totalCost = days * dailyRate;

        if(days >=7) {
            totalCost -= 50;
        } else if (days >= 3) {
            totalCost -=20;
        }
        return totalCost;
    }
}
