package business.factory;

import business.IEmployee;
import dao.impl.EmployeeImpl;

public class BusinessFactory {// ҵ�񹤳���

	public static IEmployee createEmployee() {// ȡ��Ա��ҵ�����
		return new EmployeeImpl();
	}
}
