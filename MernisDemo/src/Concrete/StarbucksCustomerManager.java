package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else
			System.out.println("Not a valid person");
	}

}
