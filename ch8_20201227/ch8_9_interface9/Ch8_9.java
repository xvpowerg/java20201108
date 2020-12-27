/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_9_interface9;
/**
 *
 * @author xvpow
 */
public class Ch8_9 {

    /**
     * Functional Interface 
     * 我想寫"一個方法" 但是我使用介面來模擬一個方法
     * 為什麼介面來模擬一個方法 ? 因為介面可以當成一個類型　傳入參數
     * Functional Interface 　表示　介面中抽象方法只有一組
     * 
     * 需要記得java內建 Functional Interface
     * Consumer<T> 消費者用來接收  accept(T t)
     * Supplier<T> 提供者用來提供   T get()
     * Predicate<T> 用來測試    boolean test(T)
	Function<T,R>  用來轉換  R	apply(T t)
	UnaryOperator<T> 用來一元運算 T	apply(T t)
     * 
     * 
     */

    static void testPrint(MyPrintIF mp,String... data){
	for (String s : data){
	    //System.out.println(s);
	    //動態的函數傳入 可以有不同顯示的選擇
	    mp.print(s);
	}
    }
    public static void main(String[] args) {
	// TODO code application logic here
	TestPrint tp = new TestPrint();
	testPrint(tp,"A","B","D");
	NumberPrint np = new NumberPrint();
	testPrint(np,"A","B","D");
    }    
}
