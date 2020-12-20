/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_2_blockorder;

/**
 *
 * @author xvpow
 */
public class TestBlockOrder {
   
    TestBlockOrder() {
	System.out.println("TestBlockOrder()!");
    }

    {
	System.out.println("非靜態1");
    }

    static {
	System.out.println("靜態1");
    }

    {
	System.out.println("非靜態2");
    }

    static {
	System.out.println("靜態2");
    }
}
