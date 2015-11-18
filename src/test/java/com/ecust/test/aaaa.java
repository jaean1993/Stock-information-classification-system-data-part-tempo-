package com.ecust.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class aaaa {
	 public static void main(String [] args)
	 {
	  String driverName="com.mysql.jdbc.Driver";
	  System.out.println(driverName);
	  String dbURL="jdbc:mysql://localhost:3306/pachong";
	  String userName="root";
	  String userPwd="931128";
	 try
	{
		Class.forName(driverName);
		System.out.println("加载驱动成功！");
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("加载驱动失败！");
	}
	try{
		Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("连接数据库成功！");
	}catch(Exception e)
	{
		e.printStackTrace();
		System.out.print("SQL Server连接失败！");
	}		
	}
}
