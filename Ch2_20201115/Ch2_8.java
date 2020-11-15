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
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//左[]總數 等於 右邊的[]的數
	//                      r  c		
	int[][] array = new int[2][3];
	array[0][0] = 16;
	array[0][1] = 95;
	array[1][1] = 75;
	array[1][2] = 38;

	
	//r
	/*for (int r = 0; r<array.length; r++){
	   for (int c = 0; c<array[r].length;c++){
	       System.out.print(array[r][c]+" ");
	   }
	      System.out.println();
	}*/
	for (int[] r : array){	    
	    for (int c : r){
		System.out.print(c+" ");
	    }
	    System.out.println();
	}
	

   

    }
    
}
