/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_5_Modifier.test;
import ch5_20201206.ch5_5_Modifier.Test1;
public class Ch5_5_2 {
    public static void main(String[] args) {
	// TODO code application logic here
	//因為Test1跟Ch5_5_2在不同package所以要import
	Test1 t1 = new Test1();
	System.out.println(t1.publicValue);
	t1.test1Public();
	
	Test2 t2 = new Test2();
	t2.test();
	t2.vv = 10;
	
	
    }
    
}
