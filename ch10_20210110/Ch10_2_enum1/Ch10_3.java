/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_2_enum1;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {
/*
    
    Enum是一個類型 
    Enum 不能自己去extends 必須透過java語法實作
    Enum 預設為static
    */
    enum Fruit{
	Apple,
	Banana,
	Cherry,
	Kiwi
    }
    public static void main(String[] args) {
	
	
	Fruit f1 = Fruit.Cherry;
	switch(f1){
	    case Apple:
		System.out.println("Apple");
		   break;
	    case Banana:
		System.out.println("Banana");
		   break;
	   case Cherry:
	       System.out.println("Cherry");
		   break;	
	   case Kiwi:
	        System.out.println("Kiwi");
		   break;		
	}
    }
    
}
