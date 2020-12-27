/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_7_interface7;



/**
 *
 * @author xvpow
 */
public interface TestIF {
    
    default void test1(){
	System.out.println("test1");
    }
}
