/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_1_stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xvpow
 */
public class Ch12_1_4 {

   static class Book{
	String name;
	String  isbn;
	List<String> stores = new ArrayList<>();
	public Book(String name, String isbn) {
	    this.name = name;
	    this.isbn = isbn;
	}
	public void addStore(String storeName){
	    stores.add(storeName);
	}	
	@Override
	public String toString() {
	    return "Book{" + "name=" + name + ", isbn=" + isbn + '}';
	}
	
    }
    public static void main(String[] args) {
	/*
	    flatMap	    
	*/
	ArrayList<Book> list = new ArrayList<>();
	Book b1 = new Book("咒術回戰","ISBN22");
	b1.addStore("博客來");
	b1.addStore("金石堂");
	Book b2 = new Book("記錄的地平線","ISBN5666");
	b2.addStore("PChome 24h書店");
	b2.addStore("金石堂");
	Book b3 = new Book("約定的夢幻島","ISBN577777");
	b3.addStore("博客來");
	b3.addStore("momo");
	list.add(b1);
	list.add(b2);
	list.add(b3);
	//flatMap  注意必須回傳Stream
	list.stream().flatMap(book->book.stores.stream()).
		distinct().forEach(System.out::println);
    }
    
}
