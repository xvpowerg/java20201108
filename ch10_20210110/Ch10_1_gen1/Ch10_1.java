/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_1_gen1;
import java.util.ArrayList;
public class Ch10_1 {
//如果再建立泛型時加上extends X 可以限定 泛型必須是X的子類
    static class Test1<T extends Number>{	
	public void run(T t){
	   System.out.println(t.floatValue());
	}
    }
    public static void main(String[] args) {
	Test1<Long> test1 = new Test1();
	test1.run(250L);
    }
    
}
