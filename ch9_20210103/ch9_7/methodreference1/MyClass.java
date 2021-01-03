/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_7.methodreference1;
import java.util.function.Consumer;
public class MyClass {
    private int v1;
    private String s1;
    MyClass(){}
    
    MyClass(int v1,String s1){
	this.v1 = v1;
	this.s1 = s1;
    }
    public String toString(){
	return s1+":"+v1;
    }    
    public void printValue(Consumer<String> consumer){
	consumer.accept(s1);
    }   
    private void printName(String name){
	System.out.println(name);
    }
    public  void testConsumer(){
	//printValue(s->System.out.println(s));
	//非靜態的method reference 呼叫方式
	printValue(this::printName);
    }
    
    
}
