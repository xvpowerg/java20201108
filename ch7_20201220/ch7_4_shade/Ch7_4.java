/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_4_shade;

/**
 *
 * @author xvpow
 */
public class Ch7_4 {
    //遮蔽
    //執行時要查看子類還是類別
    //1 屬性與靜態的方法屬性都是遮蔽
    //2 遮蔽看類別
    //3 覆寫看物件
    
    public static void main(String[] args) {
	Test1 t1 = new Test2();
	//遮蔽看類別
	System.out.println(t1.value1);
	t1.testFunc();
	t1.testFunc2();
    }
    
}
