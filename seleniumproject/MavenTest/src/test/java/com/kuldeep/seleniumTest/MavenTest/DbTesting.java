package com.kuldeep.seleniumTest.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DbTesting {
	
	private String  url="jdbc:sqlserver://10.90.90.32:8080;DatabaseName=TestCarzonrent";
	private String user="sa";
	private String password="Carz@1212";
	private Connection conn;
	
	  
	@BeforeClass
	public void getconnection() throws SQLException, ClassNotFoundException{
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connecting to Database...");
					 conn=DriverManager.getConnection(url, user, password);
					if(conn!=null){
						System.out.println("connected to DB");
					}
		}catch(SQLException e){
			e.printStackTrace();
		}catch (ClassNotFoundException ex) {
            ex.printStackTrace();
         }
					
	}
	@Test
	public void getdata(){
		
		
	}
	
	@AfterClass
	public void closeconnection() throws SQLException{
		try{
		if(conn!=null){
			conn.close();
			System.out.println("connection closed");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
