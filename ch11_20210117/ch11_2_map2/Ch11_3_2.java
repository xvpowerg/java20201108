/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_2_map2;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch11_3_2 {

    static class MyNumber implements Comparable<MyNumber>{
	private int value;
	MyNumber(int v){
	    value = v;
	}
	public int getValue(){
	    return value;
	}
	public String toString(){
	    return value+"";
	}
	
	public int compareTo(MyNumber n1){	    
	    return  getValue() -  n1.getValue() ;
	}
    }
    
    public static void main(String[] args) {
	MyNumber n1 = new MyNumber(5);
	MyNumber n2 = new MyNumber(8);
	MyNumber n3 = new MyNumber(2);
	MyNumber n4 = new MyNumber(7);
	//排序中物件有Comparable 集合內提供了Comparator
	//以Comparator為準
	Comparator<MyNumber> comp = 
		Comparator.comparing(n->n.getValue());
	comp = comp.reversed();
	TreeMap<MyNumber,String> mpa = new TreeMap(comp);
	mpa.put(n1, "N1");
	mpa.put(n2, "N2");
	mpa.put(n3, "N3");
	mpa.put(n4, "N4");
	mpa.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
