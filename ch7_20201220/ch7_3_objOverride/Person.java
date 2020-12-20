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
public class Person {
    private String name;
    private int age;
    
    Person(String name,int age){
	this.name = name;
	this.age = age;
    }
    
    public void print(){
	System.out.println(this.name +":"+this.age);
    }
    //可以將物件轉換為字串
    public String toString(){
	return this.name+":"+this.age;
    }
    //x instanceof T 問 x變數是否為T類型
    //是 回傳true 否　回傳false
    public boolean equals(Object obj){
	  if (obj == null || 
	    obj instanceof Person == false){
		return false;
	   }
	//強制轉型	
	Person tmp = (Person)obj;
	return name.equals(tmp.name) && age == tmp.age;
    }
}
