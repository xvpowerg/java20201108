/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {
  //多型擷取某類別的特徵 可以少表示多
  //可以傳入一個類別 只要可以回傳一個字串陣列 我就將他顯示出來
    public static void foreachString(ObjToStringArray objToArray){
	String[] data = objToArray.objToStringArray();	
	for (String v : data){
	    System.out.println(v);
	}	
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	Product product = new Product("PS5",3555);
	Student st1 = new Student("Vivin",56,78,95);
	Person person = new Person("Lindy","Addr: 忠孝東路...");
	
      foreachString(product);
	foreachString(st1);
	foreachString(person);
    }
}
