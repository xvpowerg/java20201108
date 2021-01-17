/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_6_stream2;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_6 {
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	//allMatch 所有都成立回傳true
	boolean b1 = list.stream().allMatch(n->n.length() > 2);
	System.out.println("allMatch:"+b1);
	//anyMatch 只要一個成立就回傳true	
       boolean b2 = list.stream().anyMatch(n->n.indexOf("i") >-1);
	System.out.println("anyMatch:"+b2);
	//noneMatch 沒有任何一個成立 就回傳true	
      boolean b3 = list.stream().noneMatch(n->n.length() < 2);
       System.out.println("noneMatch:"+b3);
       
       
      Optional<String> opt1 =   list.stream().findAny();
      Optional<String> opt2 =  list.stream().findFirst();
      Optional<String> opt3 =  list.parallelStream().findAny();
     System.out.println(opt1.get());
     System.out.println(opt2.get());
     System.out.println(opt3.get());
     System.out.println("===================");
    list.stream().limit(3).forEach(System.out::println);
     System.out.println("===================");
    list.stream().skip(2).forEach(System.out::println);
       System.out.println("===================");
       //peek 可查看Stream的動向
      list.stream().peek(n->{System.out.println(n);}).
	      noneMatch(n->n.length() < 4);
    }
    
}
