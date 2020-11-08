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
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int a1 = 10,b2 =20;
	System.out.println(a1 > b2);
	System.out.println(a1 < b2);
	System.out.println(a1 >= b2);
	System.out.println(a1 <= b2);
	//不等於
	System.out.println(a1 != b2);
	System.out.println(a1 == b2);
	
	//非基本型態
	String st1 = "Howard";
	String st2 = "Howard";
	st1 = "Ken";
	String st3 = new String("Howard");
	
	//比較記憶體位置
	System.out.println(st1 == st2);
	System.out.println(st1 == st3);
	//比較內容否一樣
	System.out.println(st1.equals(st3));
    }
    
}
