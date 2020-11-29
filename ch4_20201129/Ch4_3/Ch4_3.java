/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129.Ch4_3;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

   //建構式 (Constructor)
    public static void main(String[] args) {
	// TODO code application logic here
	Dog dog1 = new Dog();
	dog1.setName("Momo");
	dog1.setAge(5);
	dog1.setHeight(15);
	dog1.printInfo();
	//String name,int age,float height
	//好處:可快速給初始值
	//壞處:不明確參數
	Dog dog2 = new Dog("Yuyu",10,12.5f);
	dog2.printInfo();
	
	Dog dog3 = new Dog();
	dog3.printInfo();
	
    }
    
}
