package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("=====================FindById======================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("=====================FindByDepartment======================");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=====================FindAll======================");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("======================InsertIn=====================");
		Seller newSeller = new Seller (null, "Lucas", "lucas@gmail.com", new Date(), 3000.0, department);	
		sellerDao.insert(newSeller);
		System.out.println("Insert! " + newSeller.getName() + " Id = " + newSeller.getId());
		*/
		
		/*
		System.out.println("=====================DeleteById======================");
		sellerDao.deleteById();
		*/
		
		System.out.println("=====================Update=======================");
		seller = sellerDao.findById(1);
		seller.setName("Bob Brown");
		sellerDao.update(seller);
	}

}
