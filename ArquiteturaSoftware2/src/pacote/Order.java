package pacote;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<String> items;
    private double totalSum;

    public Order() {
        this.items = new ArrayList<>();
        this.totalSum = 0.0;
    }

    // Adiciona um item ao pedido
    public void addItem(String item, double price) {
        items.add(item);
        totalSum += price;
    }

    // Remove um item do pedido
    public void deleteItem(String item, double price) {
        if (items.contains(item)) {
            items.remove(item);
            totalSum -= price;
        }
    }

    // Calcula o total do pedido
    public double calculateTotalSum() {
        return totalSum;
    }

    // Retorna os itens do pedido
    public List<String> getItems() {
        return items;
    }
}