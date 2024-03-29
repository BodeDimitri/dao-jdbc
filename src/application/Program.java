package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("TEST 1");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("TEST 2");
		Department department = new Department(2, "Departamento");
		List<Seller> list = sellerDao.findByDSepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("TEST 3");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("TETS 4");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("TEST 5:");
		seller = sellerDao.findById(1); 
		seller.setName("AS");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("TEST 6");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}
}