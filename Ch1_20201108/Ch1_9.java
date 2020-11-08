/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20201108;
import java.util.Scanner;
public class Ch1_9 {
    public static void main(String[] args) {
	/*
	不可能小於0
	0-2 低量級
	    3-5 中量級
	    6-7 高量級
	    8-10 過量級
	    11+ 危險級*/
	//區間
	Scanner scan = new Scanner(System.in);
	System.out.println("請輸入UVA:");
	int uva = scan.nextInt();
	if(uva <= 2)
	    System.out.println("低量級");
	else if(uva <= 5)
	    System.out.println("中量級");
	 else if(uva <= 7){
	    System.out.println("高量級");
	}else if(uva <=10){
	   System.out.println("過量級");
	}else{
	   System.out.println("危險級");
	}
	    
    }
    
}
