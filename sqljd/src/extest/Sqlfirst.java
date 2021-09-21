package extest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Sqlfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="7894";
		try {
			Connection connection=DriverManager.getConnection(url,username,password);
			
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery("SELECT * FROM EMP");
			System.out.println("empno\tempname\tjob\tsalary\tdeptno");
			while(result.next()) {
				int empno=result.getInt("empno");
				//String empno=result.getString("empno");
				String empname=result.getString("empname");
				String job=result.getString("job");
				int sal=result.getInt("sal");
				int deptno=result.getInt("deptno");
				System.out.println(empno+"\t"+empname+"\t"+job+"\t"+sal+"\t"+deptno);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ooops ,error!");
			e.printStackTrace();
		}
	}

}
