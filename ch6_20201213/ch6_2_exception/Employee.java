/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_2_exception;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int age;
    private float height;
    public Employee(String name,int age,float height){
	this.setName(name);
	this.setAge(age);
	this.setHeight(height);	
    }    
    public void setName(String name){
	this.name = name;
    }
    //必須大於5歲
    //必須小於200歲
    //否則會出現錯誤訊息
    
      public void setAge(int age){
	 if (age < 5 || age > 200){
	     //拋出例外
	     //無效參數的例外
	     //IllegalArgumentException 無效的參數
	     throw new IllegalArgumentException("錯誤的年齡");	     		     
	 }
	this.age = age;
    }
    public void setHeight(float height){
	this.height = height;
    }    
   public String getName(){
	 return this.name;
    }
      public int getAge(){
	return this.age;
    }
    public float getHeight(){
	return this.height ;
    }
    
    public void printInfo(){
	System.out.println(getName()+":"+getAge()+":"+getHeight());	
    }
}
