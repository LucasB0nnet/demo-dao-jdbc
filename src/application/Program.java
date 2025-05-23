package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("===========================================");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===========================================");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("===========================================");
		Seller newSeller = new Seller (null, "Lucas", "lucas@gmail.com", new Date(), 3000.0, department);	
		sellerDao.insert(newSeller);
		System.out.println("Insert! " + newSeller.getName() + " Id = " + newSeller.getId());
		
		System.out.println("===========================================");
		int id = 20;
		sellerDao.deleteById(id);
	}

}
