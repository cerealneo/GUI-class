package ch16;

import java.sql.*;

public class JDBC_Ex1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://db.ecys.kr:3306/dpsdy1", "dpsdy1","lms4929!");
			System.out.println("DB ���� �Ϸ�");
			} 
		catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
			} 
		catch (SQLException e) {
			System.out.println("DB ���� ����");
			}

	}

}