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
public class Ch1_5 {

  
    public static void main(String[] args) {
	//且 && 兩邊為真才為真  週三 且 兩點場 有半價
	//或 || 單邊為真就是真  3歲以下 或 65歲以上 8折
	//互斥 ^ 一真一假才為真	
	//反向 ! 唱反調
	
	/*
	System.out.println(true && false);
	System.out.println(true || false);
	System.out.println(true ^ false);
	System.out.println(!true );*/
	
	//&& || 短路現象
	//短路現象 執行到一半就不繼續
	//左邊為F不往右
	int i = 0;
	boolean b1 = i > 1 && ++i <0;
	System.out.println(i);
	System.out.println(b1);
	//或條件
	//左邊為T短路條件成立
	int c = 1;
	boolean b2 = c > 0 || ++i > 0;
	System.out.println(i);
	System.out.println(b2);
	
    }
    
}
