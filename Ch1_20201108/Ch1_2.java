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
public class Ch1_2 {
    public static void main(String[] args) {
	
	//運算子優先順序
	//()
	//++ --
	//* / %
	// + -
	// > < >= <= == !=	
	// && ||
	//?:
	
	boolean b1 = 2 + 1 * 3 <  5 + 1 *2 && 3 + 1*2+5 > 10;
		//     5       <   7       &&   10   >  10
	System.out.println(b1);
	
	
	
    }
    
}
