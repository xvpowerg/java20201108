/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129.Ch4_4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(){
	this("A","B");
        System.out.println("Test1()");
    }
   Test1(String v1){
	this();
	System.out.println("Test1 "+ v1);
    }
   Test1(String v1,String v2){
	System.out.println("Test1 "+v1+v2);
    }
}
