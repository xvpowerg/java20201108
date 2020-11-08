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
public class Ch1_6 {

    public static void main(String[] args) {
	
	/*
	&
	|	
	^*/
	
	int b1 = 0b010100;
	int b2 = 0b101101;
	

	System.out.println(b1);
	System.out.println(b2);
	//Filter
	System.out.println(b1 & b2);
	//融合
	System.out.println(b1 | b2);
	//互斥
	System.out.println(b1 ^ b2);
    }
    
}
