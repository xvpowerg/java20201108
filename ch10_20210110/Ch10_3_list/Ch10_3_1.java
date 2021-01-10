/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_3_list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/*
ArrayList 實作了 Collection與 List的介面
*/

public class Ch10_3_1 {
    
  public static <T> void foreachList(List<T> list){
      int count = 0;
      System.out.println("=================");
      for (T v : list){
	  System.out.println(++count+":"+v);
      }
      System.out.println("=================");
  }  
      public static void main(String[] args) {
	   ArrayList<String> list = new ArrayList();
//	  Collection<String> c  = list;
//	  List<String> myList = list;
	  //List常用方法
	  //
	  list.add("Ken");
	  list.add("Vivin");
	  list.add("Lindy");	  
	  //list.forEach(v->System.out.println(v));
	  foreachList(list);
	  System.out.println("get:"+list.get(1));
	  //插入
	  list.add(1, "Lucy");
	   foreachList(list);
	  //插入一群
	   ArrayList<String> newList = new ArrayList<>();
	   newList.add("Iris");
	   newList.add("Joy");
	   newList.add("Joy");
	   list.addAll(2, newList);
	   foreachList(list);
	  //contains 是否有某內容
	   System.out.println(newList.contains("Iris"));
	   //找到目標的index找不到回傳-1
	   int index = list.indexOf("Joy");
	   System.out.println(index);
	 int index2 = list.lastIndexOf("Joy");
	    System.out.println(index2);
	   //移除 
	  list.remove("Joy");
	  foreachList(list);
	  //考條件成立才移除
	  list.removeIf(st->st.length() == 3);
	   foreachList(list);
	   //修改符合條件的內容
	   list.replaceAll(st->st.length() > 4?"Name-"+st:st);
	   foreachList(list);
	   
	   
	   
      }
}

