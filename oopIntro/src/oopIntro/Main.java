package oopIntro;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager=new ProductManager();

		
		Product product1=new Product();
		product1.id=1;
		product1.name="HP";
		product1.unitPrice=200;
		product1.detail="8 gb ram";
		
		
		Product product2=new Product();
		product2.id=2;
		product2.name="Huawei";
		product2.unitPrice=150;
		product2.detail="16 gb ram";
		
		Product[] products = {
				
				product1,
				product2
		};
		
		for(Product product:products) {
			System.out.println(product.name);
			productManager.addToCart(product);
		}
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Bahçe Mobilyalarý";
		
		Category[] categories= {
				category1,category2	
			};
			for(Category category:categories) {
				System.out.println(category.name);
			}
		
	}

}
