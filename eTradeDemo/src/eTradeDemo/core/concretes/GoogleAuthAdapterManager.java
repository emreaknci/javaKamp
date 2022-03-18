package eTradeDemo.core.concretes;

import java.util.List;

import eTradeDemo.core.abstracts.AuthService;
import eTradeDemo.entities.concretes.Customer;
import eTradeDemo.google.GoogleAuthManager;

public class GoogleAuthAdapterManager implements AuthService {

	private GoogleAuthManager authManager;
	private List<String> verificatedEmails;

	public GoogleAuthAdapterManager(List<String> verificatedEmails) {
		this.verificatedEmails = verificatedEmails;
		this.authManager = new GoogleAuthManager(this.verificatedEmails);
	}

	@Override
	public void login(Customer customer) {
		authManager.login(customer.getEmail(),customer.getPassword());
	}

	@Override
	public void register(Customer customer) {
		authManager.register(customer.getEmail(),customer.getPassword());
	}

	@Override
	public void sendToVerifyMail(String email) {
		authManager.sendToVerifyMail(email);
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		return authManager.checkVerifyAccount(email);
	}

	@Override
	public void verifyMail(String email) {
		authManager.verifyMail(email);
	}

}
