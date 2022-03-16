package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Emre","Akinci");
		//Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new EmailLogger()}; 
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger(),new FileLogger());
		customerManager.add(customer);
	}

}
