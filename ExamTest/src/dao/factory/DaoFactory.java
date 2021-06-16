package dao.factory;

import business.impl.EmployeeDaoImpl;
import dao.IEmployeeDao;


public class DaoFactory {//DAO工厂类

	public static IEmployeeDao createEmployeeDao() {//取得员工DAO对象
		return new EmployeeDaoImpl();
	}
	
	/*
	 public static IDepartmentDao getDepartmentDao() {//取得部门DAO对象
		return new DepartmentDaoImpl();
	}
	*/
}
