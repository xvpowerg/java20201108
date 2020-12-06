/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_2_extendPart2;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

	// 繼承後super()的一些特殊狀況
    public static void main(String[] args) {
	Cat c1 = new Cat();
	c1.setAge(10);
	c1.setHeight(12);
	c1.setName("LuLu");
	c1.printInfo();
	
	Cat c2 = new Cat("Momo",1,3);
	c2.printInfo();
	
	
    }
    
}
