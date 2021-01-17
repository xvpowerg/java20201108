/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_2_map1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Ch11_2 {
    public static void main(String[] args) {
	Map<String,Integer> myMap = new HashMap();
	myMap.put("Ken", 92);	
	myMap.put("Lindy", 26);
	myMap.put("Ken", 84);
	myMap.put("Lucy", 93);
	
	int value = myMap.get("Ken");
	System.out.println(value);
	//java 8
	myMap.forEach((k,v)->System.out.println(k+":"+v));
	System.out.println("===================================");
	//java 8 之前
	Set<Entry<String,Integer>> entrySet =  myMap.entrySet();
	for (Entry<String,Integer> entry : entrySet){
	    System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
	
	
    }
    
}
