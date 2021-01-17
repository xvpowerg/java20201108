/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_1_set1;
import java.util.TreeSet;
public class Ch11_1 {

    private static class Product extends tw.com.api.Product implements Comparable<Product>{
	Product(String name,int price){
	    super(name,price);
	}    
	public int compareTo(Product p1){
	    if (this.getPrice() >   p1.getPrice() ){
		return 1;
	    }else if(this.getPrice() <   p1.getPrice() ){
		return -1;
	    }
	    return 0;
	}
    }
    public static void main(String[] args) {
	  Product p1 = new Product("A1",100);  
	  Product p2 = new Product("B2",100);  
	  Product p3 = new Product("C3",95);  
	  Product p4 = new Product("D4",100);  
	  Product p5 = new Product("G6",85);  
	  
	  TreeSet<Product> set = new TreeSet<>();
	  set.add(p1);
	  set.add(p2);
	  set.add(p3);
	  set.add(p4);
	  set.add(p5);
	  set.forEach(System.out::println);
	  
	
	
	
    }
    
}
