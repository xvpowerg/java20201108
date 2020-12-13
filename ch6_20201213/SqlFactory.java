/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SqlFactory {
    final static int MYSQL = 0;
    final static int MSSQL = 1;
    final static int PSSQL = 2;

    static Properties p = new Properties ();
    static{
		 try {
	     FileReader fin =
		    new FileReader("C:\\javacode\\testsql.properties");
		p.load(fin);
		p.forEach((k,v)->{System.out.println(k+":"+v);});
		System.out.println(p.getProperty("sql"));
	} catch (FileNotFoundException ex) {
	    Logger.getLogger(SqlFactory.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(SqlFactory.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    
     public static SQLTest getSqlObj(){
	 
	String key =  p.getProperty("sql");
	switch(Integer.parseInt(key)){
	    case MYSQL:		
	    return new Mysql();
	    case MSSQL:
	    return new Mssql();		
	    case PSSQL:
	    return new Psql();	
	    default:
             throw new IllegalArgumentException("錯誤的資料庫類型");
	}
 
     }
     
         public static void main(String[] args) {
	SQLTest ms = SqlFactory.getSqlObj();
//	testInsert(ms);
//	testUpdate(ms);
//	testDelete(ms);
    }
}
