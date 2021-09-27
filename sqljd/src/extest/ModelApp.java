package extest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModelApp {
	public static void Show(String a,String b,String c) {
		try {
			
			Connection connection=DriverManager.getConnection(a,b,c);
			Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result=statement.executeQuery("SELECT * FROM EXAMP");
			System.out.println("ID\tNAME\tMARK");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));  
			}
			connection.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ooops ,error!");
			e.printStackTrace();
		}

		
	}
	public static void insert(String a,String b,String c) {
		try {
			Scanner sc=new Scanner(System.in);
			Connection connection=DriverManager.getConnection(a,b,c);
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
	public static void delete(String a,String b,String c) {
		try {
			Scanner sc=new Scanner(System.in);
			Connection connection=DriverManager.getConnection(a,b,c);
			String query="delete from examp where id =?";
			PreparedStatement prdstmt=connection.prepareStatement(query);
			System.out.println("Enter a id: ");
			int id=sc.nextInt();
			prdstmt.setInt(1,id);
			int i=prdstmt.executeUpdate();
			System.out.println(i+" records deleted"); 
			connection.close();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ooops ,error!");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="7894";
		Scanner sc=new Scanner(System.in);
		String inp;
		do {
			
			System.out.println("OPTIONS ARE :\n1.Show\n2.Insert\n3.Update\n4.DELETE");
			System.out.println("Enter a option");
			int op=sc.nextInt();
			switch(op){
			case 1:
				Show(url,username,password);
				
				break;
			case 2:
				insert(url, username, password);
				break;
			case 3:
				System.out.println("update");
				break;
			case 4: 
				delete(url, username, password);
				break;
			}
		System.out.println("Are you contine y/n?");
		inp=sc.next();
		}
		while(inp.equalsIgnoreCase("y"));
	
	}

	

	
}
