package dao.impl;

import java.util.List;

import business.IEmployee;
import dao.IEmployeeDao;
import dao.factory.DaoFactory;
import value.EmployeeValue;

public class EmployeeImpl implements IEmployee {// 员工业务实现类

	@Override
	public void add(String id, String password, String name, int age) throws Exception {
		EmployeeValue ev = new EmployeeValue();
		ev.setId(id);
		ev.setPassword(password);
		ev.setName(name);
		ev.setAge(age);
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		edo.create(ev);
	}

	@Override
	public void modify(String id, String password, String name, int age) throws Exception {
		EmployeeValue ev = new EmployeeValue();
		ev.setId(id);
		ev.setPassword(password);
		ev.setName(name);
		ev.setAge(age);
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		edo.update(ev);
	}

	@Override
	public void delete(String id) throws Exception {
		EmployeeValue ev = new EmployeeValue();
		ev.setId(id);
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		edo.delete(ev);
	}

	@Override
	public List<EmployeeValue> getList() throws Exception {
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		return edo.getList();
	}

	@Override
	public EmployeeValue getEmployee(String id) throws Exception {
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		return edo.get(id);
	}

	@Override
	public boolean check(String id, String password) throws Exception {
		boolean check = false;
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		EmployeeValue ev = edo.get(id);
		if (ev != null) {
			if (ev.getPassword().equals(password)) {
				check = true;
			}
		}
		return check;
	}

	@Override
	public void changePassword(String id, String password) throws Exception {
		IEmployeeDao edo = DaoFactory.createEmployeeDao();
		EmployeeValue ev = edo.get(id);
		if (ev != null) {
			ev.setPassword(password);
			edo.update(ev);
		}
	}
}
