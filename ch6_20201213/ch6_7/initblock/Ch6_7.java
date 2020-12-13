/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_7.initblock;

/**
 *
 * @author xvpow
 */
public class Ch6_7 {


    public static void main(String[] args) {
	NotStaticBlock nb = new NotStaticBlock();
	int index = nb.indexOf("A");
	System.out.println(index);
	
	NotStaticBlock nb2 = new NotStaticBlock(100);
	 index =  nb2.indexOf("B");
	 System.out.println(index);
    }
    
}
