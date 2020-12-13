/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_6.override2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch6_6 {
/*    覆寫的所有規則
    修飾詞 只能開放不能封閉
    回傳值 如果是基本型必須一樣
    回傳值 如果是非基本型可以是子類
    函數名稱跟參數必須一樣
    例外拋出 可以不拋出 或 拋出子類    
    */
 //討論 例外拋出 可以不拋出 或 拋出子類   
    //非必要例外檢測類型的 任意拋出例外
   //一定要知道的父子類例外
    // FileNotFoundException 是 IOException的子類型
    // IOException 是 FileNotFoundException的父類型
    public static void main(String[] args) {
	
	Test1 t1 = new Test2();
	try{
	    t1.testExcOverride();    
	}catch(IOException ex){
	    
	}
	
	
    }
    
}
