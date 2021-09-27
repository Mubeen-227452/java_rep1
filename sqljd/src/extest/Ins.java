package extest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="7894";
		try {
			Scanner sc=new Scanner(System.in);
			Connection connection=DriverManager.getConnection(url,username,password);
			String query="insert into examp values(?,?,?)";
			PreparedStatement prdstmt=connection.prepareStatement(query);
			System.out.println("Enter a id: ");
			int id=sc.nextInt();
			System.out.println("Enter a name");
			String name=sc.next();
			System.out.println("enter a mark");
			int mark=sc.nextInt();
			prdstmt.setInt(1,id);
			prdstmt.setString(2,name);
			prdstmt.setInt(3,mark);
			int i=prdstmt.executeUpdate();
			System.out.println(i+" records inserted"); 
			connection.close();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ooops ,error!");
			e.printStackTrace();
		}
	

	}

}
