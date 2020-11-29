/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129.Ch4_5;


public class Person {
    private String name;
    private int age;
    private float height;
    
  public void setName(String name){
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
	System.out.printf("Name:%s Age:%d Height:%.2f",this.getName(),
		this.getAge(),this.getHeight());
    }
}
