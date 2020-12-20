/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_1_staticblock;
import java.util.Random;
public class TestStaticBlock {
    private static int[ ] rans = new int[100];
    private static Random random = new Random();
    //靜態區塊初始化靜態的屬性
    static{
	for (int i =0; i < rans.length;i++){
	    rans[i] = random.nextInt(200000)+1;
	}
    }
    
    public TestStaticBlock(){
	
	
    }
    //rans 的內容是1~20000  之間的亂數
    public static int getRandom(){
    //不可在這寫出init rans	
    //0~99	
	int index = random.nextInt(100);	
	return rans[index];
    }   
}
