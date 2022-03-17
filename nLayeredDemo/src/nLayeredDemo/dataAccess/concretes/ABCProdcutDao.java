package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ABCProdcutDao implements ProductDao {

	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("ABC ile eklendi : " + product.getName());

	}

	public void update(Product product) {
		System.out.println("ABC ile guncellendi : " + product.getName());

	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("ABC ile silindi : " + product.getName());

	}

	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
