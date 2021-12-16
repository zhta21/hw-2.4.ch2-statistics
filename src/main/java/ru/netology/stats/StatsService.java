package ru.netology.stats;

public class StatsService {
    public long calculateSumSales (long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAvgSales (long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int calculateMaxSalesMonth(long[] sales) {
        int maxSalesMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month++;
        }
        return maxSalesMonth + 1;
    }
}
