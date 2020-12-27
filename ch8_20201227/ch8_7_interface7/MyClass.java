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
//類別實作時 發現父介面有相同default方法名稱 類別可以覆寫
public class MyClass implements  TestIF,TestIF2{
      public  void test1(){
	  System.out.println("MyClass");
      }
}