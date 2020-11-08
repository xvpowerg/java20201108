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
public class Ch1_10 {

    public static void main(String[] args) {
	//switch 可傳入 byte short int char String  enum
	int action = 10;
	final int RUN = 1;
	final int JUMP = 2;
	final int WALK = 3;
	//case 只接收常數
	switch(action){
	    case RUN:
	       System.out.println("跑");
		break;
	    default:
		System.out.println("錯誤!");	
		break;
	    case JUMP:
		System.out.println("跳");
		break;		
	    case WALK:
		System.out.println("走");
		break;	
	   
	}
	
	
	
    }
    
}
