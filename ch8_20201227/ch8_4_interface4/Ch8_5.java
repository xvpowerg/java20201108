/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_4_interface4;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * 介面的default 方法
     */
    public static void main(String[] args) {
	Teacher t1 = new Teacher("Ken");
	t1.setAge(20);
	Exception[] exs =  t1.verification();
	t1.showException();
//	for (Exception ex : exs){
//	    System.out.println(ex);
//	}
    }
    
}
