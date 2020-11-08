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
public class Ch1_13 {    
    static int test1(){
	System.out.println("test1");
	return 1;
    }
    static boolean test2(int i){
	System.out.println("test2:"+i);
	return true;
    }
    //1 2 4
    //3 2 4
    public static void main(String[] args) {
	int k= 0;
	for (int i = test1() ;i<=3 && test2(i);i++,k++){
	    System.out.println(i+"_"+k);
	}
	System.out.println(k);
	//t1 
	//test2:1
	//1_0
	//test2:2
	//2_1
	//test2:3
	//3_2
	//3
    }
    
}
