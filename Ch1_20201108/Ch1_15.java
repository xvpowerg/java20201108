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
public class Ch1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	tag:
	for (int i =1; i<=5; i++){
	    System.out.println("============Start=============");
	    for (int k = 1; k<=3;k++){
		System.out.println("Start for"+i+"_"+k);
		if (i == 3){
		    break tag;
		}
		System.out.println("End For"+i+"_"+k);		
	    }
	      System.out.println("==========End===============");
	}
	
    }
    
}
