/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_5_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String str1 = null;
	//Optional.of 參數不可為null
	//Optional o1 = Optional.of(str1);
        Optional o2 =  Optional.ofNullable(str1);
	
	String str2 = null;
	Optional<String> o3 = Optional.ofNullable(str2);
	//使用get()如果Optional內容為null會出錯
	//System.out.println(o3.get());
	//如果Optional內容為null 回傳預設值
	System.out.println(o3.orElse("Empty"));
	//如果Optional內容為null 回傳預設值
	System.out.println(o3.orElseGet(()->"Super Empty"));
	//如果Optional內容為null 拋出例外
	System.out.println(o3.orElseThrow(
		()->new IllegalArgumentException("不可為null")));
    }
    
}
