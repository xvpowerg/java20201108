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
//介面繼承時 發現父介面有相同default方法名稱 子介面可以覆寫
public interface TestIF3 extends TestIF,TestIF2{
    default void test1(){
	System.out.println("test3!!");
    }
}
