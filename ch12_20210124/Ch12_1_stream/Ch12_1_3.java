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
public class Ch12_1_3 {
 
    static class Student{
	String name;
	int score;
	    
	public Student(String name, int price) {
	    this.name = name;
	    this.score = price;
	}

	@Override
	public String toString() {
	    return "Student{" + "name=" + name + ", price=" + score + '}';
	}

	public String getName() {
	    return name;
	}

	public int getScore() {
	    return score;
	}
	
	
    }
    public static void main(String[] args) {
	Student st1 = new Student("Ken",85);
	Student st2 = new Student("Vivin",50);
	Student st3 = new Student("Ken",92);
	Student st4 = new Student("Iris",72);
	Student st5 = new Student("Joy",60);
	Student st6 = new Student("Iris",42);
	Student st7 = new Student("Vivin",32);
	ArrayList<Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	list.add(st7);
	//map 轉換的概念
	list.stream().filter(st->st.getScore() > 59).
		map(st->st.getName()).
		distinct().
		forEach(System.out::println);
	System.out.println("======================");
//注意mapToInt回傳的是IntStream		
	int  sum = list.stream().mapToInt(st->st.getScore()).sum();
	System.out.println(sum);
	
	
    }
    
}


