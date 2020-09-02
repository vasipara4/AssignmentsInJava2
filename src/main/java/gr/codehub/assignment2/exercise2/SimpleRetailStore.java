package gr.codehub.assignment2.exercise2;

public class SimpleRetailStore implements IStore {
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product p) {
        totalBuyBalance += p.getPriceWhenBuy();
    }

    @Override
    public void sell(Product p) {
        totalSellBalance += p.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }
}
