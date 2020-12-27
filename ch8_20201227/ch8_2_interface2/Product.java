/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_2_interface2;

/**
 *
 * @author xvpow
 */
public class Product  implements ObjToStringArray{
    private String name;
    private int price;
   public Product(String name,int price){
	this.name = name;
	this.price = price;
    }
   public String[] objToStringArray(){
       //整數轉字串 故意呼叫 讓同學看看String.valueOf
    
       return new String[]{name,String.valueOf(price)};
   }
}
