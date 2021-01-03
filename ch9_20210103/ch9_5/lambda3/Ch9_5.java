/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_5.lambda3;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {
    public static void main(String[] args) {
	TestIF4 tif4_1 = ()->{
	return "value1";
	};
	//自動return
	 TestIF4 tif4_2 = ()-> "Value2";
	 
	System.out.println(tif4_1.test4());
	System.out.println(tif4_2.test4());
    }
}
