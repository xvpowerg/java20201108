/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201115;
import java.util.Arrays;

public class Ch2_5 {

    public static void main(String[] args) {
	// TODO code application logic here
	int[] array = {5,9,6,1,7,8,3};
	int[] copyArray = Arrays.copyOf(array, 3);
	for (int v :copyArray){
	    System.out.print(v+" ");
	}
	 System.out.println();
	copyArray = Arrays.copyOf(array, array.length);
	for (int v :copyArray){
	    System.out.print(v+" ");
	}
	 System.out.println();
	 
	 int[] array2 = {1,2,3,4,5,6,7};
	 //index >= 2   < 5 的區間
	 int[] rangeArray = Arrays.copyOfRange(array2, 2, 5);
	 for (int v : rangeArray){
	     System.out.print(v+" ");
	 }
	  System.out.println();
	  //取得5 6 7
	  rangeArray = Arrays.copyOfRange(array2, 4, 7);
	   for (int v : rangeArray){
	     System.out.print(v+" ");
	 }
	  System.out.println();
    }
    
}
