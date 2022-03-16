package interfaces;

public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager(Logger... loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi " + customer.getFirstName() + " " + customer.getLastName());
		Utils.runLoggers(customer.getFirstName() + " " + customer.getLastName(), loggers);
	}

	public void delete(Customer customer) {
		System.out.println("Musteri silindi " + customer.getFirstName() + " " + customer.getLastName());
		Utils.runLoggers(customer.getFirstName() + " " + customer.getLastName(), loggers);

	}
}
