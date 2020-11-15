/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201115;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

 
    public static void main(String[] args) {
	//Boxing 封箱(基本型態變物件)
	//只有基本型態能封箱 
	//整數    物件
	//byte    Byte
	//short   Short
	//int     Integer
	//long    Long
	//浮點數
	//float    Float
	//double    Double
	//字元
	//char    Character	
	//布林
	//boolean  Boolean
	
	int v = 10;
	//手動封箱
	Integer myBoxing = Integer.valueOf(v);
	//手動解封箱
	int value = myBoxing.intValue();
	System.out.println(value);
	
	//自動封箱
	Integer boxing2  = 25;	
	//自動解封箱
	int ans = boxing2 + 12 ;
	System.out.println(ans);
	
	
	
		
	
    }
    
}
