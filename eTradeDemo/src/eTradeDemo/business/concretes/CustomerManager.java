package eTradeDemo.business.concretes;

import java.util.List;

import eTradeDemo.business.abstracts.CustomerCheckService;
import eTradeDemo.business.abstracts.CustomerService;
import eTradeDemo.core.abstracts.AuthService;
import eTradeDemo.dataAccess.abstracts.CustomerDao;
import eTradeDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private AuthService authService;
	private CustomerCheckService checkService;

	public CustomerManager(CustomerDao customerDao, AuthService authService, CustomerCheckService checkService) {
		this.customerDao = customerDao;
		this.authService = authService;
		this.checkService = checkService;
	}

	@Override
	public void add(Customer customer) {
		if (checkService.isValid(customer)) {

			authService.sendToVerifyMail(customer.getEmail());
			authService.verifyMail(customer.getEmail());
			authService.register(customer);
			customerDao.add(customer);

		}

	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);

	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);

	}

	@Override
	public Customer getEmail(String email) {
		return customerDao.getEmail(email);
	}

	@Override
	public Customer getPassword(String password) {
		return customerDao.getPassword(password);
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

}
