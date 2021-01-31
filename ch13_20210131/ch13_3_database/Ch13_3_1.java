/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_3_database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
//DriverManager -->Connection
//Connection -->Statement
//Statement -->ResultSet
/**
 *
 * @author xvpow
 */
public class Ch13_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb20210131";		
	String user = "qwer";
	String password = "123456";
	
	try(Connection conn = DriverManager.
		getConnection(url, user, password);){
	 Statement stm = conn.createStatement();
	 String sql = "INSERT INTO student(id,name,score) "
		 + "VALUES (%d,'%s',%f)";
	 sql = String.format(sql, 201,"Vivin",83.5);
	    int count = stm.executeUpdate(sql);
	    if(count > 0){
		System.out.println("新增成功");		
	    }else{
		System.out.println("新增失敗");		
	    }
	}catch(SQLException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
