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
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//陣列的宣告模式
	int[] array1 = new int[3];//*
	int array2[] = new int[3];
	//給初始值
	//只能用在宣告時
	int[] array3 = {8,15,25};
	//[]不可放數字
	//非宣告時 或 宣告時使用 少用
	int[] array4 = new int[]{91,25,63,71,89};		
	//錯誤 因為array3已宣告了
	//array3 = {9,56,12,35,14,18};
	array3 = new int[] {5,2};

	
	for (int i =0;i< array3.length;i++){
	    System.out.print(array3[i]+" ");
	}
	System.out.println();
	
	for (int v : array4){
	  System.out.print(v+" ");
	}
    }
    
}
