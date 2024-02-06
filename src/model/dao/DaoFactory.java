package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImpJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoImpJDBC(DB.getConnection());
	}
	
	
}
