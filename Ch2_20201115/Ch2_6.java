/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201115;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	String[] array = new String[3];	
        Arrays.fill(array, "");
	//array[1] = "Ken";
	switch(array[1]){
	    case "Ken":
		System.out.println("經理");
		break;
	    case "Vivin":
		System.out.println("業務");
		break;	
	    default:
		System.out.println("錯誤!");
	}
	//小到大的排序
	//快速排序法
	int[] priceArray = {8,1,5,9,7,6,3};	
	Arrays.sort(priceArray);
	for (int v : priceArray){
	    System.out.print(v+" ");
	}
	
	//Arrays.binarySearch(args, array)
	
    }
    
}
