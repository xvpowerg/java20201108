/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_1_gen1;
import java.util.function.Predicate;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch10_1_3 {

    /**
     * 方法泛型
     */
    
    static class Test1<T>{
	   //如果方法泛型與類別泛型相衝突時 會依照 方法泛型為主 
	public <R> R testValue(R v){
	   return v;
	}
	
	//驗證是否為空白 是空白回傳某種例外
	static <T,E extends Exception>void testEmpty(T v,
		Predicate<T> isEmpty,
		Supplier<E>getEx)throws E{
	    //如果是空白
	    if (isEmpty.test(v)){
		throw getEx.get();
	    }	    
	}
	
    }
    public static void main(String[] args) {
	Test1<String> t1 = new Test1();
	  int v = t1.<Integer>testValue(10);
	  System.out.println(v);
	  //方法泛型會自動判斷類型 依照傳入類型 判斷我的泛型是什麼類型
	  String name = t1.testValue("Ken");
	   System.out.println(name);
	   
	  Test1.testEmpty("XXX", st->st.isEmpty(),
		  ()->new RuntimeException("字串不可空白"));	   
	  Test1.testEmpty(0, i->i == 0,
		  ()->new RuntimeException("整數不可為0"));
    }
    
}
