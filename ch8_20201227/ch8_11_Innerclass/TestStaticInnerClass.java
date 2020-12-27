/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_11_Innerclass;

/**
 *
 * @author xvpow
 */
public class TestStaticInnerClass {    
     static class MyInnser{	 
	    String name;
	     MyInnser(String name){
		this.name = name;
	    }
	     public String toString(){
		 return name;
	     }
    }
}
