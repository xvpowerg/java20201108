/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_1_gen1;
import java.util.ArrayList;
public class Ch10_1_2 {
    /*
    泛型相容問題
    */
    static void testGen(ArrayList<Test1> list){
	list.add(new Test2());
    }
    //希望泛型可相容 子類型
    static void testGen2(ArrayList<? extends Test2> list){
	//如果使用了? extends Test2 只能放null
	//主要功能用來輸出
	list.add(null);
		//主要功能用來輸出
	for (Test2 v : list){
	    System.out.println(v);
	}
    }
    
      //希望泛型可相容 父類型
    public static void testGen3(ArrayList<? super Test3> list){
	//可以新增數值 但是必須<? super T> T的子類
	list.add(new Test3());
	//可以取數值類型必須是Object
	for (Object t3 : list){
	     Test3 t =(Test3)t3;
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	//一般情況下 泛型必須一樣 才相容
	ArrayList<Test1> list = new ArrayList<>();
	testGen(list);//錯誤因為ArrayList<Test1> 但傳入的為 ArrayList<Test2>
	ArrayList<Test2> list2 =new ArrayList<>();
	testGen2(list2);//可放入的泛型類型 Test2  Test3 Test4
	
	 //希望泛型可相容 父類型
	 ArrayList<Test1> list3 = new ArrayList<>();
	 list3.add(new Test6());
	 testGen3(list3);
    }

    static class Test1{
	
    }
    static class Test2 extends Test1{
	
    }
    
    static class Test3 extends Test2{
	
    }
    
    static class Test4 extends Test3{
	
    }
    static class Test5{
	
    }
     static class Test6 extends Test2{
	
    }
}
