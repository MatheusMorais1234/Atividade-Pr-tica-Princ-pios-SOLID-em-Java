package pacote;

public class OrderPrinter implements Printable{
	@Override
    public void print(Order order) {
        System.out.println("Pedido:");
        for (String item : order.getItems()) {
            System.out.println("- " + item);
        }
        System.out.println("Total: " + order.calculateTotalSum());
    }
}
