package eTradeDemo;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.business.concretes.CustomerCheckManager;
import eTradeDemo.business.concretes.CustomerManager;
import eTradeDemo.core.abstracts.AuthService;
import eTradeDemo.core.concretes.GoogleAuthAdapterManager;
import eTradeDemo.dataAccess.concretes.HibernateCustomerDao;
import eTradeDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
		AuthService authService = new GoogleAuthAdapterManager(emails);

		Customer customer1 = new Customer(1, "Emre", "Akinci", "emre@emre.com", "123456");
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(),
				new GoogleAuthAdapterManager(emails), new CustomerCheckManager());
		customerManager.add(customer1);
		authService.login(customer1);

		Customer customer2 = new Customer(2, "Engin", "Demirog", "engin@demirog.com", "engin123");
		//customerManager.add(customer2);
		//authService.login(customer2);


	}

}
