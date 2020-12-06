/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_5_Modifier;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {
    public static void main(String[] args) {
	 //public  全都可讀取
    //protected 相同package 或繼承時可讀取
    //default (空白)　相同package可讀取
    //private 只有目前類別可讀取
	Test1 t1 = new Test1();
	System.out.println(t1.defaultValue);
	System.out.println(t1.protectedValue);
	System.out.println(t1.publicValue);
	
	
    }
}
