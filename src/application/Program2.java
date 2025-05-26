package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		System.out.println("=====================Insert======================");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Department Inserted! ID =" + department.getId() + " Name =" + department.getName());
		
		
		
		System.out.println("=====================Update======================");
		DepartmentDao departmentDao2 = DaoFactory.createDepartmentDao();
		Department department1 = new Department(5, "Games");
		departmentDao.update(department);
		System.out.println("Department Update! ID =" + department.getId() + " Name =" + department.getName());
		
		
		
		System.out.println("=====================DeleteById======================");
		DepartmentDao departmentDao3 = DaoFactory.createDepartmentDao();
		departmentDao.deleteById(5);
		System.out.println("Deleted");
		
		
		
		System.out.println("=====================FindById======================");
		DepartmentDao departmentDao1 = DaoFactory.createDepartmentDao();
		Department dip = departmentDao.findById(4);
		System.out.println("Find: " + dip.getName());
		
		
		
		System.out.println("=====================FindAll======================");
		DepartmentDao departmentDao4 = DaoFactory.createDepartmentDao();
		List<Department> dep = new ArrayList<>();
		dep = departmentDao.findAll();
		for(Department x : dep) {
			System.out.println(x);
		}
		
		
		
	}

}
