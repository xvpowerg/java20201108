/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20201108;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    public static void main(String[] args) {
	// TODO code application logic here
	int age = 20;
	//{}內容只有一條命令時,可以取消{}
	if (age >= 18) System.out.println("成年"); 	    
	else  System.out.println("未成年");
	//第1元?第2元:第3元
	//第1元 boolean	
	String msg = age >= 18?"成年":"未成年";
	System.out.println(msg);

    }
    
}
