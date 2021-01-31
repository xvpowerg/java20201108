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
/**
 *
 * @author xvpow
 */
public class Ch13_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb20210131";		
	String user = "qwer";
	String password = "123456";
	    try(Connection con =DriverManager.getConnection(url,user,password);
		Statement stm =  con.createStatement();){
		   ResultSet result =  stm.executeQuery("SELECT * FROM student");
		   while(result.next()){
		       int id = result.getInt(1);
		       String name = result.getString("name");
		       float score = result.getFloat(3);
		       System.out.printf("%d %s %.2f%n",id,name,score);		       
		   }
	    }catch(SQLException ex){
		 System.out.println(ex);
	    }
	
	
    }
    
}
