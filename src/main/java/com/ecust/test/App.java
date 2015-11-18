package com.ecust.test;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/search")
public class App
{	
	@RequestMapping(value="/query")
	public void Search(HttpServletRequest request, HttpServletResponse response, String query)throws Throwable{
		
		System.out.println(query);
		//PrintWriter pw=response.getWriter();
		//pw.write("loading");
		//pw.close();
		String JDriver="com.mysql.jdbc.Driver";//SQL数据库引擎
		  String connectDB="jdbc:mysql://localhost:3306/pachong";
		  try
		  {
		   Class.forName(JDriver);//加载数据库引擎，返回给定字符串名的类
		  }catch(ClassNotFoundException e)
		  {
		   //e.printStackTrace();
		   System.out.println("加载数据库引擎失败");
		   System.exit(0);
		  }     
		  System.out.println("数据库驱动成功");
		  
		  try
		  {
		   String user="sa";
		   String password="111111";
		   Connection con=DriverManager.getConnection(connectDB,user,password);//连接数据库对象
		   System.out.println("连接数据库成功");
		   Statement stmt=con.createStatement();//创建SQL命令对象		   
		   System.out.println("开始读取数据");
		   String s="";	
		   if(query=="")
		   {
			   s="请输入查询内容";
		   }
		   else{
		   ResultSet rs=stmt.executeQuery("SELECT * FROM shares where name='"+query+"'");//返回SQL语句查询结果集(集合)
		   	 
		   //循环输出每一条记录
		   if(rs.next()){
			   //while(rs.next())
			   //{
			    //输出每个字段
			    System.out.println("knowledge card "+"\n"+"股票简称："+rs.getString("name")+"\n"+"股票代码："+rs.getString("code")+"\n"+"最新价："+rs.getString("nowprice")+"\n"+"股东："+rs.getString("customer"));
			    //s+="knowledge card "+"\n"+"name:"+rs.getString("name")+"    "+"code:"+rs.getString("code")+"\n"+"nowprice:"+rs.getString("nowprice")+"  "+"shareholder:"+rs.getString("customer");
			    s+="       知识卡片"+"\n"+"股票简称:"+rs.getString("name")+"    股票代码:"+rs.getString("code")+"\n"+"最新价:"+rs.getString("nowprice")+"    股东:"+rs.getString("customer");
			   //}
			   
		   }
		   else
			   s="输入的股票简称不存在";
		   }
		   System.out.println("读取完毕");		  
		   //s="输出";
		   System.out.println(s);
		   String utf8 = new String(s.getBytes("UTF-8"));
		   response.setHeader("Content-type", "text/html;charset=UTF-8");
		   response.setCharacterEncoding("UTF-8"); 
		   PrintWriter pw=response.getWriter();
			pw.write(utf8);
			pw.close();
		   //关闭连接
		   stmt.close();//关闭命令对象连接
		   con.close();//关闭数据库连接
		  }
		  catch(SQLException e)
		  {
		   e.printStackTrace();
		   //System.out.println("数据库连接错误");
		   System.exit(0);
		  }
		 
		
	}

}