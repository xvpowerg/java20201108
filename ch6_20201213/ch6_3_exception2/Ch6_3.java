/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_3_exception2;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch6_3 {

 //例外有哪一些
    //一種叫必要例外檢測(checked exceptions)    
   //一種叫非必要例外檢測(unchecked exceptions)
    public static void main(String[] args) {
	TestException tex = new TestException();
	try{
	  tex.testChecked(500);  	    
	}catch(Exception ex){
	    System.out.println(ex);
	}
	
    }
    
}
