/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_1_stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch12_1_6 {

 
   static class Book{
	String name;
	String  isbn;
	int price;
	List<String> stores = new ArrayList<>();
	public Book(String name, String isbn,int price) {
	    this.name = name;
	    this.isbn = isbn;
	    this.price = price;
	}
	public void addStore(String storeName){
	    stores.add(storeName);
	}	

	@Override
	public String toString() {
	    return "Book{" + "name=" + name + ", isbn=" + isbn + ", price=" + price +'}';
	}
	
    }
    public static void main(String[] args) {
	ArrayList<Book> list = new ArrayList<>();
	Book b1 = new Book("咒術回戰","ISBN22",60);
	Book b2 = new Book("記錄的地平線","ISBN5666",90);
	Book b3 = new Book("約定的夢幻島","ISBN577777",83);
	Book b4 = new Book("回復術士的重啟人生","ISBN5888",150);
	Book b5 = new Book("成神之日","ISBN5999",95);
	Book b6 = new Book("進擊的巨人","ISBN52323",86);
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.add(b4);
	list.add(b5);
	list.add(b6);
	//群組
    Map<Integer,List<Book>> groupMap= 
	    list.stream().collect(Collectors.groupingBy(book->book.price/10));
    System.out.println(groupMap);
    //群組後再做數量統計
    Map<Integer,Long> countMap = list.stream().collect(Collectors.
	    groupingBy(book->(book.price/10)*10,Collectors.counting()));
    System.out.println(countMap);
    
    //可自訂Map
    Map<Integer,Long> countMap3 = list.stream().collect(Collectors.
	    groupingBy(book->(book.price/10)*10,
		    TreeMap::new,
		    Collectors.counting()));
    System.out.println(countMap3);
     
    //二分法
    Map<Boolean,List<Book>>  patiMap=
	    list.stream().collect(Collectors.partitioningBy(book->book.price > 90));
   patiMap.forEach((k,v)->System.out.println(k+":"+v));
    
   //列出一個書本清單的字串;
   //書本清單:咒術回戰,約定的夢幻島,進擊的巨人 .
   //joining(分隔,開頭,結尾)
    String  bookStr= list.stream().map(book->book.name).
	    collect(Collectors.joining(",","書本清單:","."));
   System.out.println(bookStr);
    }
    
}
