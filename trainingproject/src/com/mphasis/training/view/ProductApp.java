package com.mphasis.training.view;

import java.util.List;
import java.util.Scanner;

import com.mphasis.training.daos.ProductDao;
import com.mphasis.training.daos.ProductDaoImpl;
import com.mphasis.training.pojos.Product;

public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Welcome to our Shop");
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.Select Product \n"
				+ "2. Add Product \n"
				+ "3. Update Product\n"
				+ "4. Delete Product\n"
				+ "5. Select Product by Name\n"
				+ "6. Select Product by Id\n"
				+ "7. exit");
		ProductDao productDao=new ProductDaoImpl();
		int choice= sc.nextInt();
		switch(choice) {
		case 1: System.out.println("list of products");
			List<Product> prods=productDao.getAllProduct();
		prods.forEach((p)->System.out.println(p.getPid()+
		" "+p.getPname()+""+p.getCost()+" "+p.getQuantity()));
		        break;
		case 2: System.out.println("enter the product to add");
				Product p1=new Product();
				p1.setPid(sc.nextInt());
				p1.setPname(sc.next());
				p1.setCost(sc.nextDouble());
				p1.setQuantity(sc.nextInt());
				productDao.insertProduct(p1);
				break;
		case 3: System.out.println("enter the product id "
				+ "and cost and quantity update");		
			productDao.updateProduct(sc.nextInt(), sc.nextDouble(), 
			sc.nextInt());
	break;
		case 4: System.out.println("enter the product id to delete");
			productDao.deleteProduct(sc.nextInt());
		break;
		case 5: System.out.println("enter the product name ");
	List<Product> products=productDao.getProductByName(sc.next());
	
			products.forEach((p)->System.out.println(p.getPid()+" "+p.getPname()+" "+p.getCost()+""+p.getQuantity()));
			break;
		case 6: System.out.println("enter the product id ");
		Product p=productDao.getProductById(sc.nextInt());
				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getCost()+""+p.getQuantity());
				break;	
		case 7: System.out.println("thanks for buying");        
				System.exit(0);
		}
		
		}while(true);
	}
}
