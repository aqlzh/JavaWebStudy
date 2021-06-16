package business.factory;

import business.IEmployee;
import dao.impl.EmployeeImpl;

public class BusinessFactory {// 业务工厂类

	public static IEmployee createEmployee() {// 取得员工业务对象
		return new EmployeeImpl();
	}
}
