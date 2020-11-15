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
public class Ch2_10 {

   
    public static void main(String[] args) {
	int[] values = {5,6,9,1,3,11};
	System.out.println(values[5]);
	System.out.println(values[2]);
	//因為超過最大index 執行時會出錯
	//System.out.println(values[6]);
	
	int[][] array3xn = new int[3][];
	array3xn[0] = new int[]{5,6,7,1};
	array3xn[2] = new int[]{2,15};
	
	System.out.println(array3xn[2][1]);
	//System.out.println(array3xn[0][4]);//ArrayIndexOutOfBoundsException
	System.out.println(array3xn[0][3]);
	System.out.println(array3xn[1][0]);//java.lang.NullPointerException
	//
    }
    
}
