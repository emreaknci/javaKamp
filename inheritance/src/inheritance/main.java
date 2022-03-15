package inheritance;

public class main {

	public static void main(String[] args) {
		IndividualCustomer yEmre=new IndividualCustomer();
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		CustomerManager customerManager=new CustomerManager();
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		yEmre.id=1;
		hepsiBurada.customerNumber="12345";
		yEmre.customerNumber="6789";
		sendikaCustomer.customerNumber="932931";
		customerManager.addCustomer(hepsiBurada);
		customerManager.addCustomer(yEmre);
		customerManager.addCustomer(sendikaCustomer);
		Customer[] customers= {yEmre,hepsiBurada,sendikaCustomer};
		customerManager.addMultiple(customers);
		
	}

}
