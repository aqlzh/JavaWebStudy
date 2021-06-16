package business.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.IEmployeeDao;
import dao.factory.*;
import value.EmployeeValue;

public class EmployeeDaoImpl implements IEmployeeDao {// 员工DAO实现类

	@Override
	public void create(EmployeeValue ev) throws Exception {
		String sql = "insert into EMPLOYEE(EMPID,PASSWORD,NAME,AGE) value (?,?,?,?)";
		Connection cn = null;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, ev.getId());
			ps.setString(2, ev.getPassword());
			ps.setString(3, ev.getName());
			ps.setInt(4, ev.getAge());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new Exception("EmployeDAOAddError:" + e.getMessage());
		} finally {
			cn.close();
		}
	}

	@Override
	public void update(EmployeeValue ev) throws Exception {
		String sql = "update EMPLOYEE set PASSWORD = ?,NAME = ?,AGE = ? where EMPID = ?";
		Connection cn = null;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, ev.getPassword());
			ps.setString(2, ev.getName());
			ps.setInt(3, ev.getAge());
			ps.setString(4, ev.getId());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new Exception("EmployeDAOUpdateError:" + e.getMessage());
		} finally {
			cn.close();
		}
	}

	@Override
	public void delete(EmployeeValue ev) throws Exception {
		String sql = "delete from EMPLOYEE where EMPID = ?";
		Connection cn = null;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, ev.getId());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new Exception("EmployeDAODeleteError:" + e.getMessage());
		} finally {
			cn.close();
		}
	}

	@Override
	public EmployeeValue get(String id) throws Exception {
		EmployeeValue ev = null;
		String sql = "select * from EMPLOYEE where EMPID = ?";
		Connection cn = null;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ev = new EmployeeValue();
				ev.setId(rs.getString("EMPID"));
				ev.setPassword(rs.getString("PASSWORD"));
				ev.setName(rs.getString("NAME"));
				ev.setAge(rs.getInt("AGE"));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new Exception("EmployeDAOGetError:" + e.getMessage());
		} finally {
			cn.close();
		}
		return ev;
	}

	@Override
	public List<EmployeeValue> getList() throws Exception {
		List<EmployeeValue> empList = new ArrayList<EmployeeValue>();
		String sql = "select * from EMPLOYEE";
		Connection cn = null;
		try {
			cn = ConnectionFactory.getConnection();
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EmployeeValue ev = new EmployeeValue();
				ev.setId(rs.getString("EMPID"));
				ev.setPassword(rs.getString("PASSWORD"));
				ev.setName(rs.getString("NAME"));
				ev.setAge(rs.getInt("AGE"));
				empList.add(ev);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new Exception("EmployeListDAOGetError:" + e.getMessage());
		} finally {
			cn.close();
		}
		return empList;
	}
}
