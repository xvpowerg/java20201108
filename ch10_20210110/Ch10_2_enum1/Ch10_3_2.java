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
public class Ch10_3_2 {

     enum Fruit{
	Apple,
	Banana,
	Cherry,
	Kiwi
    }
    public static void main(String[] args) {
	//字串取得列舉物件
	System.out.println(Fruit.valueOf("Banana"));
	System.out.println(Fruit.valueOf("Cherry"));
	//System.out.println(Fruit.valueOf("Momo"));
//	Fruit[] fs = Fruit.values();
//		for (Fruit f1 : fs){
//		    System.out.println(f1);
//		}
// Apple類別是Fruit Apple是一個物件
   System.out.println(Fruit.Apple.name());
   System.out.println(Fruit.Kiwi.ordinal());
    }
    
}
