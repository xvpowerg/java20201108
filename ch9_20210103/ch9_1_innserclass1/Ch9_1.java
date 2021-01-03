/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_1_innserclass1;
import ch9_20210103.ch9_1_innserclass1.TestInnerClass.Item;
import java.util.function.Consumer;
public class Ch9_1 {
    /*
	非靜態內部類    
    */
    static class PrintItem implements Consumer<Item>{
	public void accept(Item item){
	    System.out.println(item);
	}
    }

    public static void main(String[] args) {
	// TODO code application logic here
	TestInnerClass innerclass = new TestInnerClass("A0001");
	innerclass.addItem(10, "Ps6");
	innerclass.addItem(11, "Andorid");
	innerclass.addItem(12, "PHP");
	PrintItem pi = new PrintItem();
	innerclass.foreachItem(pi);
	//再進靜態的方法new item
	TestInnerClass inner = new TestInnerClass("B0002","outName");
	TestInnerClass.Item item2 = inner.new Item(20,"Switch!");
	System.out.println(item2);
    }
    
}
