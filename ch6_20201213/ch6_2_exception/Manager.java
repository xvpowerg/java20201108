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
public class Manager extends Employee {
    public Manager(String name,int age,float height){
	super(name,age,height);
    }
    
    public String getName(){
	return "Manager: "+ super.getName();
    }
    
}
