/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201115;
import java.util.Arrays;
public class Ch2_7 {

   
    public static void main(String[] args) {
	int[] array = {8,5,10,4,3,7};
	//一定小到大排序 才可 binarySearch
	Arrays.sort(array);
	//3 4 5 7 8 10
	int index = Arrays.binarySearch(array, 5);
	System.out.println(index);
	//找不到 一定是負數
	//1 大於所的內容 (最大的index + 2)*-1
	int  i1 = Arrays.binarySearch(array, 100);
	System.out.println(i1);
	//2 小於所有的內容 回傳-1
	int  i2 = Arrays.binarySearch(array, 1);
	System.out.println(i2);
	//3 介於數值之間
    }
    
}
