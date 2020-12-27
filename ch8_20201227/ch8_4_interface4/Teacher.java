/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_4_interface4;

/**
 *
 * @author xvpow
 */
public class Teacher  implements TestIFDefault{
    private String name;
    private int age;
    public Teacher(String name){
	this.name = name;
    }
    public void setAge(int age){
	this.age = age;
    }
    
    public Exception[] verification(){
	Exception[] ex= new Exception[2];
	int i =0;
	 if (this.age < 10 || age > 200){
	      ex[i++] = new IllegalArgumentException(name+":錯誤的年齡");
	 }
	  if (name == null || name.length() < 2){
	      ex[i++] = new IllegalArgumentException("錯誤的姓名");
	 }
	 return ex;
     }
}
