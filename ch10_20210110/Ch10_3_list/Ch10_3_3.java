/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_3_list;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
/**
 *
 * @author xvpow
 */
public class Ch10_3_3 {

    /**
     * Queue
     */
    public static void main(String[] args) {
	Queue<String> queue =  new LinkedList();
	//Queue
	queue.offer("Ken");
	queue.offer("Vivin");
	queue.offer("Lindy");
	String v = null;
	  while( (v = queue.poll())!=null ){
	      System.out.println(v);
	  }
	  System.out.println("======================");
	Deque<String> stack =  new LinkedList();  
	stack.addFirst("Lucy");
	stack.addFirst("Tom");
	stack.addFirst("Iris");
	stack.forEach(v2->{System.out.println(v2);});
	System.out.println("queue:"+queue.size());
	System.out.println("stack:"+stack.size());
	  
    }
    
}
