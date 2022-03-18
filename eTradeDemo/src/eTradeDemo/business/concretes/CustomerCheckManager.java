package eTradeDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eTradeDemo.business.abstracts.CustomerCheckService;

import eTradeDemo.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	private List<String> listOfEmail;

	public CustomerCheckManager() {
		listOfEmail = new ArrayList<String>();
	}

	@Override
	public boolean checkFirstName(Customer customer) {
		if (customer.getFirstName().isEmpty()) {
			System.out.println("Name cannot be empty");
			return false;
		} else if (customer.getFirstName().length() < 2) {
			System.out.println("Name must be at least 2 characters");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if (customer.getLastName().isEmpty()) {
			System.out.println("Surname cannot be empty");
			return false;
		} else if (customer.getLastName().length() < 2) {
			System.out.println("Surname must be at least 2 characters");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (customer.getEmail().isEmpty()) {
			System.out.println("Email cannot be empty");
			return false;
		} else if (pattern.matcher(customer.getEmail()).find() == false) {
			System.out.println("This email format error!  e.g: customer@customer.com");
			return false;

		}
		return true;
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if (customer.getPassword().isEmpty()) {
			System.out.println("Password cannot be empty");
			return false;
		} else if (customer.getPassword().length() < 6) {
			System.out.println("Password must be at least 6 characters");
			return false;
		}

		return true;
	}

	@Override
	public boolean customerExists(Customer customer) {
		boolean result = true;
		if (listOfEmail.contains(customer.getEmail())) {
			System.out.println("This email is already exists.");
			result = false;
		} else {
			result = true;
			listOfEmail.add(customer.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if (checkFirstName(customer) && checkLastName(customer) && checkEmail(customer) && checkPassword(customer)
				&& customerExists(customer) == true) {
			return true;
		}
		return false;
	}

}
