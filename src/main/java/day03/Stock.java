package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    List<Double> stock = new ArrayList<>();
    double minValue;
    double maxValue;
    double maxProfit;

    public Stock(List<Double> stock) {
        this.stock = stock;
    }

    public List<Double> getStock() {
        return stock;
    }

    public double maxProfit() {

        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i) <= minValue || i==0 ){
                if (maxProfit < maxValue - minValue) {
                  maxProfit = maxValue - minValue;
                }
                minValue = stock.get(i);
                maxValue = 0;
            }
            if (stock.get(i) > maxValue) {
                maxValue = stock.get(i);
            }
        }
        if (maxProfit < maxValue - minValue) {
            maxProfit = maxValue - minValue;
        }
        return maxProfit;
    }
}

