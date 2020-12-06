/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_6_override_mod;

public class Ch5_6 {

    //Modifier 與 Override
    //複寫時只能開放不能封閉
    //如果看不到不會有複寫問題
    public static void main(String[] args) {
	Test1 t1 = new Test2();
	t1.test1Default();
	t1.test1Protected();
	t1.test1Public();
	//t1.test1Protected();
    }
    
}
