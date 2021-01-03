/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_8.generic;

import java.util.ArrayList;
import java.util.function.Consumer;
public class MyArrayList<T> {
   private  ArrayList<T> list = new ArrayList();
    
   public void add(T v){
       list.add(v);       
   }
   
   public T get(int index){
       return list.get(index);
   }
  //作業 修正  
//   public void forach(Consumer<String> c){
//       for (String v : list){
//	   c.accept(v);
//       }
//   }
}
