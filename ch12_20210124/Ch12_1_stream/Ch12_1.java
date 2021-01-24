/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_1_stream;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("Vivin");
	list.add("Ken");		
	list.add("Lindy");
	list.add("Joy");    
	//只要一個不成立就短路
	list.stream().peek(v->System.out.println("Peek:"+v)).
		allMatch(n->n.length() > 3);
	//只要一個成立就短路 回傳true
	list.stream().peek(v->System.out.println("Peek:"+v)).
	anyMatch(n->n.length() < 5);
	//只要一個成立就短路 回傳false
	//希望字串開頭都不是L
	boolean findL = list.stream().peek(v->System.out.println("Peek:"+v)).
		noneMatch(n->n.startsWith("L"));
	System.out.println(findL);
	
    }
    
}
