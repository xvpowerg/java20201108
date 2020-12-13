/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_4_exception3;
public class Ch6_4 {
//客制化例外
    public static void main(String[] args) {
	TestMyException tmyex = 
		new TestMyException();
	try{
	    // 測試MyException
	   tmyex.testMyException(true); 
	}catch(MyException ex){
	    System.out.println(ex);
	}	
	//越下越父
	try{
	 tmyex.testInputException("AAA");   
	}catch(NumberEmptyException ex){
	    System.out.println("NumberEmptyException:"+ex);
	}catch(InputEmptyException ex){
	    System.out.println("InputEmptyException"+ex);
	}
	
    }    
}
