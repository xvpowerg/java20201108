/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_5_Modifier.test;
import ch5_20201206.ch5_5_Modifier.Test1;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    public int vv;
    public void test(){
	System.out.println(this.protectedValue);	   
	this.test1Protected();
    }
}
