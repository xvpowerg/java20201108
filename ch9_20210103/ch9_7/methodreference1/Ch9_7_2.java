/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_7.methodreference1;

/**
 *
 * @author xvpow
 */
public class Ch9_7_2 {

    /**
     * 非靜態的method reference 呼叫方式
     */
    public static void main(String[] args) {
	MyClass myclass = new MyClass(10,"Gigi");
	myclass.testConsumer();
    }
    
}
