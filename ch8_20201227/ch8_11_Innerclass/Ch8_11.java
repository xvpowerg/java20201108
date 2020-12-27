/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_11_Innerclass;
import ch8_20201227.ch8_11_Innerclass.TestStaticInnerClass.MyInnser;
/**
 *
 *內部類 依附在某個類別下的類別
 * 可使用所有的修飾詞 public protected .....
 * 建立內部類原因
 * 1 存取權限的問題
 * 2 可以節省類別名稱
 * 3 方便
 * 
 * 內部類分類
 * static  靜態
 *   靜態的不可呼叫非靜的屬性與方法
 * not static 非靜態
 * 匿名(anonymous)
 */
public class Ch8_11 {
    public static void main(String[] args) {
	// TODO code application logic here
	TestStaticInnerClass tsc = new TestStaticInnerClass();
	
	MyInnser myinner =
		new MyInnser("Vivin");
	System.out.println(myinner);
    }
    
}
