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
public class Ch11_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Map<String,Integer> myMap = new HashMap();
	myMap.put("Ken", 92);	
	myMap.put("Lindy", 26);	
	myMap.put("Lucy", 93);
        myMap.put("Ben", 30);
	//compute Key存在 Key不存在 都會執行 BiFunction 回傳值會影響Map
	myMap.compute("Lucy", (k,v)->{
	    System.out.println("compute Key存在"+k+":"+v);	    
	    return 87;
	});
	System.out.println(myMap);
	
	
	//Key不存在 value為null
	 myMap.compute("Tom", (k,v)->{
	    System.out.println("compute Key不存在"+k+":"+v);	    
	    return 96;
	});
	System.out.println(myMap);
	//computeIfAbsentKeyKey不存在 會執行 Function 回傳值會影響Map
	myMap.computeIfAbsent("Joy", (k)->82);
	System.out.println(myMap);
	//computeIfPresent Key存在 會執行 BiFunction 回傳值會影響Map
	myMap.computeIfPresent("Ben", (k,v)->{	    
	    System.out.println("Key存在:"+k+":"+v);
	    return v + 30;
	});
	System.out.println(myMap);
	
    }
    
}
