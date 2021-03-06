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

    public int calculateMinSalesMonth(long[] sales) {
        int minSalesMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minSalesMonth]) {
                minSalesMonth = month;
            }
            month++;
        }
        return minSalesMonth + 1;
    }

    public int calculateSalesBelowAvg(long[] sales) {
        int monthsBelowAvg = 0;
        long AvgSales = calculateAvgSales(sales);
        for (long sale : sales) {
            if (sale < AvgSales) {
                monthsBelowAvg++;
            }
        }
        return monthsBelowAvg;
    }

    public int calculateSalesAboveAvg(long[] sales) {
        int monthsAboveAvg = 0;
        long AvgSales = calculateAvgSales(sales);
        for (long sale : sales) {
            if (sale > AvgSales) {
                monthsAboveAvg++;
            }
        }
        return monthsAboveAvg;
    }
}
