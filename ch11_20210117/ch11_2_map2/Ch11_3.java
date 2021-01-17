/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_2_map2;
import java.util.TreeMap;
public class Ch11_3 {

    /**
     * TreeMap 可排序
     * TreeMap 用Key排序
     */
    public static void main(String[] args) {
	
	TreeMap<Integer,String> map = new TreeMap<>();
	map.put(10, "Ken");
	map.put(6, "Vivin");
	map.put(2, "Lucy");
	map.put(8, "Iris");
	
	map.forEach((k,v)->System.out.println(k+":"+v));
	System.out.println(map.firstKey());
        System.out.println(map.lastKey());
	
    }
    
}
