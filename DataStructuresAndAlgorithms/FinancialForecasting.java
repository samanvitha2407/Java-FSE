package DataStructuresAndAlgorithms;

import java.util.*;

class Forecast {
    private double[] revenue;

    public Forecast(double[] revenue) {
        this.revenue = revenue;
    }

    public double movingAverage(int window) {
        int n = revenue.length;
        double sum = 0;
        for (int i = n - window; i < n; i++) sum += revenue[i];
        return sum / window;
    }
}

public class FinancialForecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of months: ");
        int n = sc.nextInt();
        double[] revenueData = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter revenue for month " + (i+1) + ": ");
            revenueData[i] = sc.nextDouble();
        }

        Forecast forecast = new Forecast(revenueData);


        System.out.print("Enter moving average window size: ");
        int window = sc.nextInt();

        double next = forecast.movingAverage(window);
        System.out.printf("Forecasted next revenue: %.2f%n", next);
    }
}

