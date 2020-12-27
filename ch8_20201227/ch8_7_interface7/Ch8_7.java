/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_7_interface7;



/**
 *
 * @author xvpow
 */
public class Ch8_7 {

    /**
     * 如果default 方名稱一樣 會發生什麼事
     * 介面繼承時 發現父介面有相同default方法名稱 子介面可以覆寫
     * 類別實作時 發現父介面有相同default方法名稱 類別可以覆寫
     */
    public static void main(String[] args) {
	MyClass myc = new MyClass();
	myc.test1();
    }
    
}
