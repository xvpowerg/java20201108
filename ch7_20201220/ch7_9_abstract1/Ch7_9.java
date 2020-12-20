/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_9_abstract1;

/**
 *
 * @author xvpow
 */
public class Ch7_9 {
    /*
     無法變成物件的類型 變為抽象類型
    　希望提醒開發人員　覆寫某個方法
    // abstract的類別無法new 
    */

    public static void main(String[] args) {
	Animal a1 = new Dog("Ken",31);
	System.out.println(a1);
    }
    
}
