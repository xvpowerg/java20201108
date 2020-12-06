/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_1_extendPart1;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    public static void main(String[] args) {
	    //繼承不會繼承父類別建構式(在子類別無法使用)
	    //如果要使用父類別建構式請使用super()
	    //繼承不會繼承父類別私有的內容(在子類別無法使用)
	Dog dog1 = new Dog("NiNi",2,5);
	dog1.printInfo();//希望輸出name:NiNi age:2  heihgt:5.00
	
	
	
    }
    
    
}

