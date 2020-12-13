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
public class Test2 extends Test1 {
    //只能開放不能封閉
   public void testProtected(){
	System.out.println("Test2 Protected!");
    }
   @Override
      public float testFloat(){
	return 0.0f;
    } 
      //回傳值可以是子類型
      public Test2 getTest1(){
	return null;
    }
}
