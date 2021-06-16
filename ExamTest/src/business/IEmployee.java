package business;

import java.util.List;

import value.EmployeeValue;

public interface IEmployee {//员工业务接口

	public void add(String id,String password,String name,int age) throws Exception;
	public void modify(String id,String password,String name,int age) throws Exception;
	public void delete(String id) throws Exception;
	public List<EmployeeValue> getList() throws Exception;
	public EmployeeValue getEmployee(String id) throws Exception;
	public boolean check(String id,String password) throws Exception;
	public void changePassword(String id,String password) throws Exception;
}
