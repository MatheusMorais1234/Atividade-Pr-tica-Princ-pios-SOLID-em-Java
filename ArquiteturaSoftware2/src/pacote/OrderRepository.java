package pacote;

public class OrderRepository implements Persistable{
	 @Override
	    public void saveToDatabase(Order order) {
	        System.out.println("Salvando pedido no banco de dados...");
	    }
	}