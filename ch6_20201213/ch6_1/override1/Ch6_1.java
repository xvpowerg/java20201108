/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_1.override1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

 /*    覆寫的所有規則
    修飾詞 只能開放不能封閉
    回傳值 如果是基本型必須一樣
    回傳值 如果是非基本型可以是子類
    函數名稱跟參數必須一樣
    例外拋出 可以不拋出 或 拋出子類    
    */
    public int test1(String n) throws NullPointerException{
	return 0;
    }
    public static void main(String[] args) {
	// TODO code application logic here
    }
    
}
