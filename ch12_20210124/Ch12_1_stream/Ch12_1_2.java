/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_1_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch12_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("Vivin");
	list.add("Ken");		
	list.add("Lindy");
	list.add("Joy"); 
	list.add("Lucy");
	list.add("Iris"); 
	list.stream().limit(2).forEach(System.out::println);
	System.out.println("========");
	list.stream().skip(2).forEach(System.out::println);	
	Stream.iterate(1, (n)->n+1).skip(2).
		limit(100).forEach(System.out::println);
	
    }
    
}
