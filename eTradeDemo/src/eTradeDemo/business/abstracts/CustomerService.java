package eTradeDemo.business.abstracts;

import java.util.List;

import eTradeDemo.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);

	Customer getEmail(String email);

	Customer getPassword(String password);

	List<Customer> getAll();

}
