package gr.codehub.assignment2.exercise2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

    @Override
    public String toString() {
        return "Product " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceWhenBuy=" + priceWhenBuy +
                ", priceWhenSell=" + priceWhenSell;
    }
}
