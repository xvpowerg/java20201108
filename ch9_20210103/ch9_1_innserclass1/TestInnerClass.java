/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_1_innserclass1;
import java.util.ArrayList;
import java.util.function.Consumer;
public class TestInnerClass {
    private String id; 
    private String name;
    private ArrayList<Item> list = new ArrayList<>();
    TestInnerClass(String id){
	this.id = id;
    }
       TestInnerClass(String id,String name){
	this.id = id;
	this.name = name;
    }
    public void addItem(int price,String name){
	Item item = new Item(price,name);
	list.add(item);
    }
    
    public void foreachItem(Consumer<Item> itemConsumer){
	list.forEach(itemConsumer);
    }
    class Item{
	 private int price;
	 private  String name;
	 Item(int price,String name){
	     this.price = price;
	     this.name = name;	     
	 }
	 public String toString(){
	     //內部類如與外部類屬性名稱相同，讀取外部類的屬性的方式
	     //外部類名稱.this.屬性名稱
	     return TestInnerClass.this.name+":"+id+":"+ name+":"+price;
	 }
     }
}
