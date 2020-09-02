package gr.codehub.assignment2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {
    private List<Product> products;
    private double totalBuyBalance = 0.0;
    private double totalSellBalance = 0.0;


    public InventoryRetailStore() {
        products = new ArrayList<>();
    }

    @Override
    public void buy(Product p) {
        totalBuyBalance += p.getPriceWhenBuy();
        products.add(p);
    }

    @Override
    public void sell(Product p) {
        if (products.remove(p))
            totalSellBalance += p.getPriceWhenSell();

    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    public void getInventory() {
        System.out.println("Inventory:");
        products.forEach(System.out::println);
    }

    public void reset() {
        totalBuyBalance = 0;
        totalSellBalance = 0;
        products.clear();
    }
}
