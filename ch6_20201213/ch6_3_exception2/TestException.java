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
public class TestException {
    //test checked 
    // throws 這個方法可能發生的錯誤
    public void testChecked (int n)throws Exception,SQLException{	
	if (n > 100){
	    throw new Exception("Checked Exception");
	}	
    }
    //不強制你一定要定義拋出
    //我try catch
    public void testUnchecked(boolean b1){
	if (b1){
	    throw new RuntimeException("Unchecked");
	}
    }
}
