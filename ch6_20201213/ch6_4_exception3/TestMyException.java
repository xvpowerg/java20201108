/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_4_exception3;

/**
 *
 * @author xvpow
 */
public class TestMyException {
    public void testMyException(boolean b1)throws MyException{
	if (b1){
	    throw new MyException("測試 MyException");
	}
    }
    
    public void testInputException(String msg)
	    throws InputEmptyException,NumberEmptyException{
	
	 if (msg == null || msg.isEmpty()){
	     throw new InputEmptyException("輸入不可空白");
	 }
	try{
	    Integer.parseInt(msg);
	}catch(NumberFormatException ex){
	    throw new NumberEmptyException("不正確的數字:"+
		    ex.getMessage());
	}
    }
}
