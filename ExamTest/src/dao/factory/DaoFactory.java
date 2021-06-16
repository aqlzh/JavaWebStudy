package dao.factory;

import business.impl.EmployeeDaoImpl;
import dao.IEmployeeDao;


public class DaoFactory {//DAO������

	public static IEmployeeDao createEmployeeDao() {//ȡ��Ա��DAO����
		return new EmployeeDaoImpl();
	}
	
	/*
	 public static IDepartmentDao getDepartmentDao() {//ȡ�ò���DAO����
		return new DepartmentDaoImpl();
	}
	*/
}
