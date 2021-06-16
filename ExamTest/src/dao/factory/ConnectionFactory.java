package dao.factory;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {// ���ݿ����ӹ�����

	public static Connection getConnection() throws Exception {
		Connection cn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/scott");
			System.out.println(ds);
			cn = ds.getConnection();
			ctx.close();
		} catch (Exception e) {
			throw new Exception("ȡ�����ݿ����Ӵ���:" + e.getMessage());
		}
		return cn;
	}
}
