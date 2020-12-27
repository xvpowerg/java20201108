/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {
    //介面屬性一律是 public static final
    
    public static void main(String[] args) {
	System.out.print(TestIF.VALUE1);
	System.out.print(TestIF.VALUE2);
	//不能修改因為VALUE2是常數
	//TestIF.VALUE2 = "";
    }
    
}
