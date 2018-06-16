package com.ibm.logic;

import java.sql.*;
public class LIVEJDBCCLASS {

  public static void main(String[] args) {
	
	  
	 String username="sql7240973";
	 String password="MpsfY32PZg";
	 String url="jdbc:mysql://sql7.freemysqlhosting.net/sql7240973";
	 String driver="com.mysql.jdbc.Driver";
	 
	 try
	 {
		 Class.forName(driver);
		 Connection con=DriverManager.getConnection(url, username, password);
		 System.out.println("connected with remote database");
		 
		 String sql="select * from Employee";
		 PreparedStatement ps=con.prepareStatement(sql);
		 ResultSet rs=ps.executeQuery();
		 System.out.println("ID"+""+"FIRSTNAME"+""+"LASTNAME"+" "+"GENDER");
		 while(rs.next())
		 {
			 System.out.print(rs.getString(1));
			 System.out.print(rs.getString(2));
			 System.out.print(rs.getString(3));
			 System.out.print(rs.getString(4));
			 System.out.println();
		 }
		 
		 
		 
		 
		 
		 
		 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	  

	  
	  
	  
	  
	  

	}

}
