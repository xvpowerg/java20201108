/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129.Ch4_2;

/**
 *
 * @author xvpow
 */
public class Product {
    String name;   
    
   private int price;
    //複合模式
    //Product has a(有一個) Company
    Company company;
    //能用方法取質就用方法
    void printInfo(){
	System.out.printf("品名:%s 金額:%d 公司名稱:%s%n"
		,name,getPrice(),company.name);
    }    
    //寫入資料 約定 使用set開頭    
    public void setPrice(int myPrice){
	//驗證機制
	 if (myPrice <0 ){
	     System.out.println(name+"金額不可小於0");
	     return;
	 }   
	 //特別針對PS 系列作檢查	 
	 if (name.indexOf("PS") > -1 && myPrice < 28000){
	     System.out.println("ps系列 金額不可小於28000");
	     return;
	 }
	price = myPrice;
    }    
    public int getPrice(){
	//可以加入一些額外條件
	return price;
    }
    
}
