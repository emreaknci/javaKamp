package oopIntro;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Huawei D16");
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(12000);

		Product product2 = new Product();

		Product product3 = new Product(1, "Lenovo", 15000, "16 GB Ram", 10);
		Product[] products = {

				product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
			productManager.addToCart(product);
		}

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");

		Category[] categories = { category1, category2 };
		for (Category category : categories) {
			System.out.println(category.getName());
		}

	}

}
