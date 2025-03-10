package pacote;

public class OrderApp {
	 public static void main(String[] args) {
		 
	        Order order = new Order();
	        order.addItem("Camiseta", 50.0);
	        order.addItem("Calça", 100.0);
	        order.deleteItem("Camiseta", 50.0);
	        
	        Printable printer = new OrderPrinter();
	        Persistable repository = new OrderRepository();

	        printer.print(order);
	        repository.saveToDatabase(order);
	        
	    }
}