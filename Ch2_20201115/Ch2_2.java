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
public class Ch2_2 {
    
    public static void main(String[] args) {
	//陣列
	//長度為5
	//類行為int的陣列
	int[] scoreArray = new int[5] ;
	scoreArray[0] = 72;
	int index = 1;
	scoreArray[index] = 93;	
	scoreArray[3] = 82;
       System.out.println("Length:"+scoreArray.length);
	System.out.println("[1]:"+scoreArray[1]);
	System.out.println("[2]:"+scoreArray[4]);
	System.out.println("==========================");
	for (int i = 0;i<scoreArray.length;i++){
	    System.out.println(i+":"+scoreArray[i]);
	}

	//foreach
	System.out.println("============foreach==============");
	
//	for (int i= 0;i<scoreArray.length ;i++){
//	    int v = scoreArray[i];
//	    System.out.println(v);
//	}

	for (int v : scoreArray){
	      System.out.println(v);
	}
    }
}
