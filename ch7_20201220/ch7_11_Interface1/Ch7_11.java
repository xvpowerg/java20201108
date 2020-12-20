/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_11_Interface1;

/**
 *
 * @author xvpow
 */
public class Ch7_11 {
    //說明介面
    //類別跟介面的關西我們稱為實作
    //無法用類別表示的 如技能 情緒 協定
    //飛 跳 
    public static void main(String[] args) {
	Wifi5g w5 = new Wifi5gRouter();
	w5.input("ABCD.....");
	String data = w5.output();
	System.out.println(data);
	System.out.println(w5.getHz());	
    }
    
}
