/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_3_objOverride;

/**
 *
 * @author xvpow
 */
public class Ch7_3 {
    /*
      常用覆寫
    所有的類別都是Object的子類
    
    */
    public static void main(String[] args) {
	Person p1 = new Person("Ken",25);	
	Person p2 = new Person("Ken",25);
	p1.print();	
	System.out.println(p1);
	System.out.println(p1.getClass().getName()+
		"@"+Integer.toHexString(p1.hashCode()));
	//比較記憶體位置
	System.out.println(p1 == p2);
	//equals 預設是比較記憶體位置 但可以覆寫
	System.out.println(p1.equals(p2));
	// null 回傳False
	System.out.println(p1.equals(null));
	
	String test = "Howard";
	System.out.println(
		p1.equals(test));
	//自串串接+ 也會自動呼叫物件的toString()
	System.out.println("物件:"+p1);
    }
    
}
