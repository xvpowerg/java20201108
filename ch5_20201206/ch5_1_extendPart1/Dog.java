/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_1_extendPart1;

/**
 *
 * @author xvpow
 */
//所有的Dog都是Animal
public class Dog  extends Animal{
    //UML圖表是繼承關係
    //super() 表示 呼叫父類別無傳參數的建構式(預設建構式)
    //super(*) 只能存在於建構式　且　只能是建構式的第一個命令
    public Dog(String name,int age,float height){
	// * 表示0到無限多個數
	//如果沒有自己呼叫super(*) 或 this(*)會自動呼叫super()	
	super(name,age,height);	
    }
    
    

}
