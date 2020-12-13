/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_1.override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    protected void testProtected(){
	System.out.println("Test1 Protected!");
    }
    
    public float testFloat(){
	return 0.0f;
    } 
    
    public Test1 getTest1(){
	return null;
    }
}
