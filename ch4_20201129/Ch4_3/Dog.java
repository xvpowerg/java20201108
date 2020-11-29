/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129.Ch4_3;

/**
 *
 * @author xvpow
 */
public class Dog {
    private String name;
    private int age;
    private float height;
    //沒有回傳值
    //函數名稱跟類別一樣
     //預設建構式
     public Dog(){ 
	 //預設值
	 //this()呼叫其他建構式
	 //只能是建構式的第一個命令
	 this("未設定",-1,0);
     }
    //建構式
    Dog(String name,int age,float height){
	    setName(name);
	    setAge(age);
	    //使用this因為方便
	    this.setHeight(height);
    }
    //this. 表示當前物件
    public void setName(String name){
	//利用this找到屬性名稱
	this.name = name;		
    }
    public String getName(){
	return name;
    }    
    public void setAge(int age){
	this.age = age;
    }    
    public int getAge(){
	return age;
    }    
   public void setHeight(float height){
	this.height = height;
    }    
    public float getHeight(){
	return height;
    }    
    
    public void printInfo(){
	System.out.printf("Name:%s Age:%d Height:%.2f%n"
		,getName(),getAge(),getHeight());	
	
    }
    
}
