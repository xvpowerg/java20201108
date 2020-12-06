/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_4_override;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    //Override 覆寫
    // 子類的函數 覆蓋了父類的函數
    //polymorphism 多型
    public static void main(String[] args) {
	
	Tiger tiger1 = new Tiger("Tony",5,180,250);
	//Override
	tiger1.printInfo();
	//polymorphism
	//可把子類型放到父類型
	Animal animal;
	animal =  tiger1;
	animal.printInfo();
	
    }
    
}
