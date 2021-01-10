/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_4_set;
import java.util.TreeSet;
public class Ch10_5 {
//TreeSet  可排序
  //terrSet 預設為遞增排序ASC
    //DESC 遞減
    
    
    static class Product implements Comparable<Product>{
	private String name;
	private int price;

	public Product(String name, int price) {
	    this.name = name;
	    this.price = price;
	}   
	    //如果是ASC排序規則
	    //目前的數值大於傳入數值 回傳正數
	     //目前的數值小於傳入數值 回傳負數
	    //目前的數值等於傳入數值 回傳0
	public int compareTo(Product p){
	     if (this.getPrice() > p.getPrice()){
		 return 1;
	     }else if(this.getPrice() < p.getPrice()){
		 return -1;
	     }
	     //如果產品金額一樣比產品名稱
	     return getName().compareTo(p.getName());
	}
	
	public String getName() {
	    return name;
	}

	public int getPrice() {
	    return price;
	}
	public String toString(){
	    return name+":"+price;
	}
	
    }
    public static void main(String[] args) {
	/*TreeSet<Integer> terrSet = new TreeSet();
	terrSet.add(50);
	terrSet.add(20);
	terrSet.add(60);
	terrSet.add(10);
	terrSet.add(30);
	terrSet.forEach(v->System.out.println(v));*/
	
	Product p1 = new Product("K89M",3999);
	Product p2 = new Product("PS5",56000);
	Product p3 = new Product("Ipad",15600);
	Product p4 = new Product("IPhone 4",15600);
	TreeSet<Product> terrSet2 = new TreeSet();
	terrSet2.add(p1);
	terrSet2.add(p2);
	terrSet2.add(p3);
	terrSet2.add(p4);
	terrSet2.forEach(p->System.out.println(p));
	
    }
    
}
