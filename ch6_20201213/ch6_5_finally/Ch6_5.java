/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_5_finally;
import ch6_20201213.ch6_4_exception3.NumberEmptyException;
/**
 *
 * @author xvpow
 */
public class Ch6_5 {
//Finally 當try這段程式碼完成後一定要做的事
    //清除資源
    //關閉連線等等
    public static void main(String[] args) {
//	try{
//	   System.out.println("Test!!");
//	    throw new NumberEmptyException("NumberEmptyException!!!"); 	   
//	}finally{
//	    System.out.println("一定會執行一次");
//	}
	//順序  
	//try內部
	//catch
	//finally
	try{
	   System.out.println("Test!!");
	    throw new NumberEmptyException("NumberEmptyException!!!"); 	   
	}catch(NumberEmptyException ex){
	    System.out.println(ex);
	}finally{
	    System.out.println("一定會執行一次");
	}
	
	   
	
	
    }
    
}
