package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkFirstName(Customer customer);

	boolean checkLastName(Customer customer);

	boolean checkEmail(Customer customer);

	boolean checkPassword(Customer customer);

	boolean customerExists(Customer customer);

	boolean isValid(Customer customer);
}
