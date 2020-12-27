/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_6_interface6;
public class Ch8_6 {

    /**
     * 如果default 方名稱一樣 會發生什麼事
     * 介面繼承時 發現父介面之間有繼承關係相同default方法名稱 不會發生錯
     * 類別實作時 發現父介面之間有繼承關係相同default方法名稱 不會發生錯
     * 運時default方法會依子類為準
     */
    public static void main(String[] args) {
	// TODO code application logic here
	MyClass myclsss = new MyClass();
	myclsss.test1();
    }
    
}
