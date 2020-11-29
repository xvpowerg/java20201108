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
public class Ch4_2 {
    //封裝 Encapsulation
    public static void main(String[] args) {
	Product p1 = new Product();
	p1.name = "PS5";
	p1.setPrice(38000);
	Company c1 = new Company();
	c1.name = "Sony";
	c1.phone = "8855252";
	p1.company = c1;
	p1.printInfo();
	//封裝 Encapsulation
	//第一步 變私有化
	// 私有只能在類別內讀寫
	Product p2 = new Product();
	
	p2.name= "PS6";
	p2.setPrice(1500);
	p2.company = c1;
	p2.printInfo();
	
	String st1 = "PS6";
	
	System.out.println(st1.indexOf("D"));
	System.out.println(st1.indexOf("PS") > -1);
    }
    
}
