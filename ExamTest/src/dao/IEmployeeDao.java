package dao;

import java.util.List;
import value.*;

public interface IEmployeeDao {// 员工DAO接口

	public void create(EmployeeValue ev) throws Exception;

	public void update(EmployeeValue ev) throws Exception;

	public void delete(EmployeeValue ev) throws Exception;

	public List<EmployeeValue> getList() throws Exception;

	public EmployeeValue get(String id) throws Exception;
}
