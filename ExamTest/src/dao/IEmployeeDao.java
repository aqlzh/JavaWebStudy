package dao;

import java.util.List;
import value.*;

public interface IEmployeeDao {// Ա��DAO�ӿ�

	public void create(EmployeeValue ev) throws Exception;

	public void update(EmployeeValue ev) throws Exception;

	public void delete(EmployeeValue ev) throws Exception;

	public List<EmployeeValue> getList() throws Exception;

	public EmployeeValue get(String id) throws Exception;
}
