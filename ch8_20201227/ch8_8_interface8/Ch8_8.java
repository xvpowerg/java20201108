/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_8_interface8;

/**
 *
 * @author xvpow
 */
public class Ch8_8 {

    /**
     * 介面靜態方法
     * 介面靜態方法 不會 繼承到子介面與實作的類別
     */
    public static void main(String[] args) {
	
	MyClass myclass = new MyClass();
	myclass.test();
	//不能呼叫 因為 介面靜態方法不會繼承到子介面與實作的類別
	//myclass.compare(1,5);
	TestStaticIF.compare(5, 8);
    }
    
}
