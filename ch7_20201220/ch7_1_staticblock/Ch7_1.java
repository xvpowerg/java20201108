/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_1_staticblock;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /*    
      討論靜態初始化區塊
    */
    //static 屬於類別 (只要有類別就可呼叫)
    //無使用static 屬於物件(必須有物件才可呼叫)
    public static void main(String[] args) {
	//TestStaticBlock tsb = new TestStaticBlock();
   // System.out.println(tsb.getRandom());
    System.out.println(TestStaticBlock.getRandom());
   
    }
    
}
