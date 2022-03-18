package eTradeDemo.core.abstracts;

import eTradeDemo.entities.concretes.Customer;

public interface AuthService {
	void login(Customer customer);

	void register(Customer customer);

	void sendToVerifyMail(String email);

	boolean checkVerifyAccount(String email);

	void verifyMail(String email);
}
