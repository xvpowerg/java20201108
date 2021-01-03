/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_2_innserclass2;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    /**
     * 匿名內部類    
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Dog dog1 = new Dog();
	dog1.bark();
	Dog dog2 = new Dog2();
	dog2.bark();//喵喵	
	
	//支支
	//覆寫方法使用匿名內部類
	Dog dog3 = new Dog(){
	  public void bark(){
	      System.out.println("支支!");
	  }
	};
	dog3.bark();
	
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Iris");
	//使用於內部類的區域變數必須是常數
	
	Consumer<String> myPrint =  new Consumer<String>(){
	    int count = 0;
	   public void accept(String str){
		count++;    
	       System.out.println(count+":"+str);
	   }
	};
	list.forEach(myPrint);
	
	list.forEach(new Consumer<String>(){
	    public void accept(String str){
		  System.out.print(str+" ");
	    }
	});
    }
    
}
