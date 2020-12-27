/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_8_interface8;

/**
 *
 * @author xvpow
 */
public interface TestStaticIF {
    void test();
    default void testDeafult(){
	test();
    }
    //靜態的方法不能呼叫抽象的
    public static int  compare(int a,int b){
	if (a > b ){
	    return 1;
	}else if(a <b){
	    return -1;
	}
	//test();
	 return 0;
    }
}
