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
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[][][] arrra1 = new int[2][3][4];
	int[] arrra2[][] = new int[2][3][4];
	int arrra3[][][] = new int[2][3][4];
	
	int[][] array4 = {{5,7,1},
			  {8,9,3},
			  {20,30,40,50}};
	System.out.println(array4[2][3]);
	
	int[][] array5 = new int[][]{  
	    {1,2},
	    {7,8,5}	
	};
	
	int[][] array6 = new int[3][];
	array6[0] = new int[7];
	array6[1] = new int[2];
	array6[2] = new int[5];
	
    }
    
}
