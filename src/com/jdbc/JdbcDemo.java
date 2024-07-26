package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	
 public static void main(String args[]) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/nttdatabase","salesforcentt","salesforcentt");
		    System.out.println("connected");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from employee");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
		    rs.close();
		    st.close();

	    }
		catch(Exception e) {
			e.printStackTrace();
		}
	 
 }
}
