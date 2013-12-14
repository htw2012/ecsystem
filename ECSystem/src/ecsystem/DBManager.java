package ecsystem;

import java.sql.*;

public class DBManager {

	ResultSet rs;

//	String url = "jdbc:odbc:driver={Microsoft Access Driver (mdb)};DBQ=e:\\ECSystem\\ECSystem.mdb";
//	String url = "jdbc:odbc:driver={Microsoft Access Driver (mdb)};DBQ=d:\\ECSystem\\ECSystem.mdb";
	String url = "jdbc:odbc:MS Access Database;DBQ=d:\\ECSystem\\ECSystem.mdb";
	public DBManager() {
	}

	public ResultSet getResult(String sql) {
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection conn = DriverManager.getConnection(url);

			Statement stmt = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("executeSql------" + sql);

			return rs;
		}

		catch (Exception e) {
			System.out.println("getResult------" + e.toString());

			return null;
		}
	}

	public boolean executeSql(String sql) {
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection conn = DriverManager.getConnection(url);

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(sql);
			System.out.println("executeSql------" + sql);

			conn.commit();

			return true;
		} catch (Exception e) {
			System.out.println("executeSql------" + e.toString());

			return false;
		}
	}
}
