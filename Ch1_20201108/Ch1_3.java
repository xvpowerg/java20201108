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
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// ++i 或 ++i 獨立放置時功能一樣
	int i = 0;
	++i;
	System.out.println(i);
	
	int c = 0;
	//System.out.println(c++);
	System.out.println(++c);
	System.out.println(c);
	
	int k = 0;
	int g = ++k + k++ +k + k-- + ++k;
	//       1  + 1	  +2 + 2 +  2  
	System.out.println("g:"+g);
	System.out.println("k:"+k);
	
    }
    
}
