/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_6_override_mod;

public class Test2 extends Test1 {
     @Override
      public void test1Public(){
	  System.out.println("Test2 Public");
       }
       @Override
      //可使用 public
      protected void test1Protected(){
	   System.out.println("test2 Protected");
      }
        @Override
      //可使用 protected public
      void test1Default(){
	System.out.println("test2 Default!!");
    } 
    //因為看不到所以 是新增一個函數 
      
     protected void test1Private(){
	 System.out.println("test1Private!!");
     }
}
