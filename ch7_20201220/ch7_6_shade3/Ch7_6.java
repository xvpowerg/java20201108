/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_6_shade3;

import ch7_20201220.ch7_5_shade2.*;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Test2 t2 = new Test2();
	//因為Test2 沒有setValue 方法
	//所以會呼叫父類別的setValue
	t2.setValue("Test Value!");
	
	System.out.println(t2.value);
	System.out.println(t2.getValue());
    }
    
}
