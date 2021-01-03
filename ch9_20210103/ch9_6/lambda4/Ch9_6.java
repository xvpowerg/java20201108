/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_6.lambda4;

/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    static interface TestIF5{
	String test5(int v1,String v2);
    }
    public static void main(String[] args) {
	TestIF5 test5 = (i1,s2)->{
		return i1+s2;
	};
	System.out.println(test5.test5(10, "Test5:"));
	TestIF5 test6 = (int i1,String s2)->{
		return i1+s2;
	};
	TestIF5 test7 = (int i1,String s2)-> i1+s2;
	
    }
    
}
