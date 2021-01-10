/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_4_set;
import java.util.Set;
import java.util.HashSet;
public class Ch10_4 {

    //基本的集合
    //不在意順序
    //不可重複
    
    static class Element{
	 private int id;
	 private String name;

	public Element(int id, String name) {
	    this.id = id;
	    this.name = name;
	}

	public int getId() {
	    return id;
	}

	public String getName() {
	    return name;
	}
	 public String toString(){
	     return name+":"+id;
	 }
	 //equals 相等 hashCode 必須相等
	 public boolean equals(Object obj){
	     Element e =  (Element)obj;
	     return name.equals(e.name) && id == e.id;
	 }
	 public int hashCode(){
	     return id+name.hashCode();
	 }
	 
    }
    
    public static void main(String[] args) {
	/*HashSet<String> set = new HashSet<>();
	set.add("Ken");
	set.add("Iris");
	set.add("Vivin");
	set.add("Ken");
	set.forEach(st->System.out.println(st));*/
	Element e1 = new Element(10,"A1");	
	Element e2 = new Element(70,"B1");
	Element e3 = new Element(10,"A1");
	Element e4 = new Element(80,"C1");
	Element e5 = new Element(67,"K2");
	System.out.println(e1.equals(e3));
	
	 //equals 相等 hashCode 必須相等
	 //hashCode 相等 equalse 不一定相等
	//HashSet 是先比較HashCode相等 在比 equals
	HashSet<Element> set2 = new HashSet();
	set2.add(e1);
	set2.add(e2);
	set2.add(e3);
	set2.add(e4);
	set2.add(e5);
	set2.forEach(e->System.out.println(e));
	System.out.println(e1.hashCode());
	System.out.println(e1.hashCode());
	
	
    }
    
}
