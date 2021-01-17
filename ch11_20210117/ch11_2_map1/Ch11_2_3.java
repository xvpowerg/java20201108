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
public class Ch11_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	Map<String,Integer> myMap = new HashMap();
	myMap.put("Ken", 92);	
	myMap.put("Lindy", 26);	
	myMap.put("Lucy", 93);
        myMap.put("Ben", 30);
	//java8
	//key 存在 merge 會執行biFunction 並且將return數值寫回map
	//key 存在會更新
	myMap.merge("Lucy", 83, (o,n)->{
	    System.out.println("Key存在:"+o+":"+n+" ");
	    return o + n;});
	System.out.println("map:"+myMap);
	//key 不存在 會新增 不會執行bifunction
	myMap.merge("Iris", 75, (o,n)->{
			System.out.println(o+":"+n);
			    return 0;
			    } 
		);
	System.out.println("map:"+myMap);
	
	
    }
    
}
