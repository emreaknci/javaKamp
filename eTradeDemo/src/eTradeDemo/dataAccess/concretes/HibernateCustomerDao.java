package eTradeDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.dataAccess.abstracts.CustomerDao;
import eTradeDemo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers;

	public HibernateCustomerDao() {
		customers = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer customer) {
		System.out.println("Customer added with Hibernate -> " + customer.getEmail());
		customers.add(customer);
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated with Hibernate -> " + customer.getEmail());
		Customer updateToCustomer = null;
		for (Customer c : customers)
			if (c.getId() == customer.getId())
				updateToCustomer = customer;
		updateToCustomer.setFirstName(customer.getFirstName());
		updateToCustomer.setLastName(customer.getLastName());
		updateToCustomer.setEmail(customer.getEmail());
		updateToCustomer.setPassword(customer.getPassword());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted with Hibernate -> " + customer.getEmail());
		Customer deleteToCustomer = null;
		for (Customer c : customers)
			if (c.getId() == customer.getId())
				deleteToCustomer = customer;

		customers.remove(deleteToCustomer);
	}

	@Override
	public Customer getEmail(String email) {
		for (Customer customer : customers)
			if (customer.getEmail() == email)
				return customer;

		return null;
	}

	@Override
	public Customer getPassword(String password) {
		for (Customer customer : customers)
			if (customer.getPassword() == password)
				return customer;

		return null;
	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

}
