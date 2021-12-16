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
}
