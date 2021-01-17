/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_1_set1;
import java.util.TreeSet;
import tw.com.api.Product;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch11_1_2 {

    
    static class  MyComp implements Comparator<Product>{
	//p1 大於 p2 回傳正數
	//p1 小於 p2 回傳負數
	//p1 等於 p2 回傳0
	public int compare(Product p1,Product p2){
	    return p1.getPrice() - p2.getPrice();
	}	
    }
    
    public static void main(String[] args) {
	  Product p1 = new Product("A1",100);  
	  Product p2 = new Product("B2",100);  
	  Product p3 = new Product("C3",95);  
	  Product p4 = new Product("D4",100);  
	  Product p5 = new Product("G6",85);  
//舊寫法	  
//	  Comparator<Product> cmp = new Comparator<Product>(){
//	    public int compare(Product p1,Product p2){
//		  return p1.getPrice() - p2.getPrice();
//	    }
//	  };

//新寫法	  
 //Comparator<Product> cmp2 = (cp1,cp2)->cp1.getPrice()-cp2.getPrice();
 
 //有SOP
 Comparator<Product> cmp3 =Comparator.comparing(p->p.getPrice());
  //thenComparing 繼續排其他條件
  cmp3 = cmp3.thenComparing(p->p.getName());
  
	  TreeSet<Product> set = new TreeSet<>(cmp3);
	  set.add(p1);
	  set.add(p2);
	  set.add(p3);
	  set.add(p4);
	  set.add(p5);
	  set.forEach(System.out::println);
	  
	  
    }
    
}
