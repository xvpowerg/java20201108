/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_8.generic;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch9_8 {

    /**
     * 泛型的功能 希望提前知道資料是什麼類型!!
     * 泛型可用來限定
     * 泛型只可放物件
     */
    public static void main(String[] args) {
	// TODO code application logic here
	MyArrayList myList = new MyArrayList();
	
	myList.add("Ken");
	myList.add("Vivin");
	System.out.println(myList.get(0));
	System.out.println(myList.get(1));
	//讓我自己限定要放什麼東西到List內
	MyArrayList<Integer> intList = new MyArrayList();
	intList.add(10);
	intList.add(20);
	//作業
	//使用lambda方式實作forach內的Consumer　
	//使用method reference方式實作forach內的Consumer
	//myList.forach(c);
	
    }
    
}
