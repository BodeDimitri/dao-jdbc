package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		Department newDepertment = new Department(1, "aa");
		dp.insert(newDepertment);
		System.out.println("Inserted! New id: " + newDepertment.getId());
		
		
	}

}
