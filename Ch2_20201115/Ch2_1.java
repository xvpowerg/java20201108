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
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//當不清楚 次數時
	int i = 10;
	while(true){
	    if (i <= 0){
		break;
	    }
	    System.out.println(i--);
	}
	 System.out.println("================");
	 
	//一定會做一次
	int k = 20;
	do{
	    System.out.println(k--);//20	    
	}while(k>=10);
	
	
    }
    
}
