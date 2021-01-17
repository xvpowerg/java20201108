/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_4_stream1;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//100%考!
	//Stream 特性
	//1 不可重複使用
	//2 有惰性與終端
	//3 不可修改性
	Stream<String> st1 = Stream.of("A","B","C","D");
         long count = st1.count();
	 System.out.println(count);
	 //1 不可重複使用 會出錯
	  //Object obj =  st1.findAny();
	  Stream<String> st2 = Stream.of("A","B","C","D");
	  //filter 是惰性的 lazy
	  //只呼叫惰性的函數不會有反應
	  st2.filter(v->{
	      System.out.println("V:"+v);
	      return true;
	  });
	   //count 是終端的 terminal 
	  //呼叫終端的函數鏈就會開始執行
	 Stream<String> st3 = Stream.of("A","B","C","D");
	   st3.filter(v->{
	      System.out.println("V:"+v);
	      return true;
	  }).count();
	   
	   ArrayList<String> list = new ArrayList<>();
	   list.add("A");
	   list.add("B");
	   list.add("C");
	   list.add("D");
	   list.stream().filter(v->v.equals("B")||v.equals("D")).
		   forEach(x->System.out.println(x));
	  System.out.println(list.size());
	  
    }
    
}
