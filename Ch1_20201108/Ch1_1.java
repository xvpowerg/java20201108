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
public class Ch1_1 {
    public static void main(String[] args) {
	//變數
	//整數 沒小數點的
	//byte  -128~127
	//short
        //int
        //long
	//浮點數 有小數點的
	//float 32 
	float price = 56.2f;
	System.out.printf("price:%.2f%n",price);
	//double 64
	
	//char 0~65535
	char c1 = 'H';
	System.out.println(c1);
	int charCode = c1;
	System.out.println(charCode);
	//String
	//String s1 = "Howard";
	//開頭可以是 _ $ 英文字母
	//之後可以是 _ $ 英文字母 數字
	// 數字底線 底線前後必須是底線或數字
	int $23__ = 1__233_567;
	System.out.println($23__);
	//boolean
	
    }    
}
