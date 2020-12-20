/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_9_abstract1;

/**
 *
 * @author xvpow
 */
// 無法變成物件的類型 變為抽象類型
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
	this.name = name;
	this.age = age;
    }
    public String toString(){
	return this.name+":"+this.age;
    }
}
