package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		DatabaseLogger dbLogger=new DatabaseLogger();
		customerManager.addCustomer(dbLogger);
	}

}
 