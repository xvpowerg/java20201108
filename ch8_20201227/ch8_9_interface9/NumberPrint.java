/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_9_interface9;

/**
 *
 * @author xvpow
 */
public class NumberPrint  implements MyPrintIF{
    private int count = 0;
    public void print(String str){
	System.out.println(++count+":"+str);
    }
}
