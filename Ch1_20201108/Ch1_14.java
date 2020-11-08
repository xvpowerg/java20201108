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
public class Ch1_14 {

    public static void main(String[] args) {
	//break 離開區塊的概念
	//continue 繼續下次迴圈
	int k = 3;
	/*for (int i =1;i<=5;i++){	    
	    System.out.println(i);
	    if (i > k) break;
	}*/

	for (int i = 1;i<=5;i++){	    
	    if (i == k) continue;
	    System.out.println(i);
	}
	
    }
    
}
