/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_2_blockorder;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /*
    1 靜態與非靜初始化區塊的順序
       靜態區塊
       非靜態區塊
       建構子
    
    區塊呼叫次數:
    靜態區塊 只需呼叫一次
    非靜態區塊 看new幾次
    
    靜態的東西(方法 ,屬性) 會早於非靜態建立
    2 靜態為什只能呼叫靜態?
        在靜態的東西產生時非靜態的還沒誕生
    3 靜態什麼時候用　非靜什麼時候用?
       //靜態 不須用到 非靜態方法或屬性時
      //非靜態 須用到 非靜態方法或屬性時
    4 非靜態因為屬於物件 記憶體不共享
    */
    public static void main(String[] args) {
	TestBlockOrder tbo1 = new TestBlockOrder();
	TestBlockOrder tbo2 = new TestBlockOrder();
	
	//測試靜態記憶體分享
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();
	t1.value= 10;
	t2.value = 85;
	
	t1.stValue= 10;//Test1.setValue = 10
	t2.stValue = 85;//Test1.setValue = 85
	
	
	System.out.println(t1.value +":"+ t2.value);
	System.out.println(t1.stValue +":"+ t2.stValue);
    }
  
}
