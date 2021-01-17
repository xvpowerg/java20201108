/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_2_map1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch11_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Map<String,Integer> myMap = new HashMap();
	myMap.put("Ken", 92);	
	myMap.put("Lindy", 26);	
	myMap.put("Lucy", 93);
       myMap.put("Ben", 30);
	//判斷是否有此key存在
	System.out.println(myMap.containsKey("Ken"));
	//java8才有的
	System.out.println(myMap.getOrDefault("Iris", 0));
	//key 重複會被覆蓋
	myMap.put("Lindy", 85);
	System.out.println(myMap);
	//java8 如果key不存在才put 
	myMap.putIfAbsent("Lucy", 62);
	myMap.putIfAbsent("Tom", 95);
	System.out.println(myMap);
	myMap.replaceAll((k,v)->v<60?60:v);
	System.out.println(myMap);

    }
    
}
