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
public class Animal {
    private String name;
    private int age;
    private float height;
    
    public  Animal(){	
	//呼叫目前類別的另一組建構式
	   this("未設定",-1,-1);
    }
    public Animal(String name,int age,float height ){
	setName(name);
	setAge(age);
	setHeight(height);	
    }
    
    public String getName(){
	return name;
    }
    public void setName(String name){
	
	 this.name = name;
    }    
    public int getAge(){
	return age;
    }
    public void setAge(int age){
	this.age = age;	
    }    
    public float getHeight(){
	return height; 
    }  
    public void setHeight(float height){
	this.height = height;
    }
    
    public void printInfo(){
	System.out.printf("name:%s age:%d height:%.2f%n",name,age,height);
    }   
}
