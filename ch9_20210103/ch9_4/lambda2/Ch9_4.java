/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_4.lambda2;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {
    public static void main(String[] args) {
	TestIF3 testIF3_1 = (String s1,int i2)->{
	    System.out.println(s1+":"+i2);
	};
	testIF3_1.test3("A1",25);
	
	TestIF3 testIF3_2 = (s1, i2)->
		System.out.println(s1+":"+i2);
	testIF3_2.test3("B2", 16);
	//一個參數以上時()不可移除
	//TestIF3 testIF3_3 = s1, i2->System.out.println(s1+":"+i2);
	
	
	
    }
    
}
