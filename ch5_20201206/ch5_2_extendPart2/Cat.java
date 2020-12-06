/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_2_extendPart2;

public class Cat extends Animal{
    //預設建構式 
    //當我的類別沒有任何建構式時,會自動建立一組預設建構式
    //考試時候 看到繼承 必須注意 父類別與子類的建構式的關係
    public Cat(){
	//如果沒呼叫super(name,age,height)會拋出例外,因為父類別不存在預設建構式
	super("未設定",-1,-1);
    }
    
    public Cat(String name,int age,float height){
	//super(name,age,height);
	super(name,age,height);
    }
}
