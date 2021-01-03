/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_3.lambda1;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     *lambda只能用於Functional Interface
     * 使用Lambda將Functional Interface功能做出來
     * Functional Interface 定義方法
     * lambda 真的功能做出來
     */
    public static void main(String[] args) {
	TestIF tf = ()->{
	System.out.println("Test1!");
	};
	tf.test1();
	//只有一條命令 無參數時 可省略{}與;
	TestIF tf2 = ()->System.out.println("Test2");
	tf2.test1();
	//有一個參數時的標準版
	TestIF2 tf2_1 = (String v1)->{
		System.out.println(v1);
	};
	tf2_1.test2("TIF2 第一次測試");
	//有一個參數時的取消選告參數類型
	TestIF2 tf2_2 = (v1)->{
		System.out.println(v1);
	};
	tf2_2.test2("TIF2 第二次測試");
	//有一個參數時的取消選告參數類型 與 ()
	TestIF2 tf2_3 = v1->System.out.println(v1);
	tf2_3.test2("TIF2 第三次測試");
	
    }
    
}
