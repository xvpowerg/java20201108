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
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch12_1_5 {

 
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
	Book b7 = new Book("進擊的巨人","ISBN52323",100);
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.add(b4);
	list.add(b5);
	list.add(b6);
	list.add(b7);
	//將Stream的內容轉為List
	List<Book> bookList = 
		list.stream().filter(b->b.price > 90).collect(Collectors.toList());
       System.out.println(bookList);
       //可自訂集合
       HashSet<Book> bookSet = list.stream().filter(b->b.price > 90).
	       collect(Collectors.toCollection(HashSet::new));
       System.out.println(bookSet);
       bookSet.forEach(System.out::println);
       //如果key重複 使用以下方法不會發生錯誤
       Map<String,Book> bookMap = list.stream().collect(Collectors.toConcurrentMap(
			    book->book.isbn,
			    book->book,
			    (ov,nv)-> (ov.price>nv.price ?ov:nv)));
       
       System.out.println("===================");
       bookMap.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
