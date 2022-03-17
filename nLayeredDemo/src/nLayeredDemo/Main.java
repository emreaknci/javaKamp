package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerAdapterManager;
import nLayeredDemo.dataAccess.concretes.ABCProdcutDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		// ToDo : Spring IoC ile cozulecek
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerAdapterManager());
		ProductService productService1 = new ProductManager(new ABCProdcutDao(), new JLoggerAdapterManager());

		Product product1 = new Product(1, 1, "Elma", 12, 50);
		Product product2 = new Product(2, 2, "Armut", 10, 30);
		Product product3 = new Product(3, 2, "Muz", 15, 30);

		productService.add(product1);
		productService.add(product2);
		productService1.add(product3);

	}

}
