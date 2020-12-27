/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_4_interface4;

/**
 *
 * @author xvpow
 */
public interface TestIFDefault {
    //驗證
     Exception[] verification();
     //default 預設為public
     //default方法 用來呼叫介面內抽象方法的
   //可以提供顯示錯誤的功能
     
     public default void  showException(){	 
	 if(isFail()){
	      Exception[]  exs = verification();
	     for (Exception ex : exs){
		 if (ex != null)
		   System.out.println(ex);
	     }
	 }
     }
   //可以幫我驗證是否有錯誤
     default boolean isFail(){	 
	 Exception[]  exs = verification();
	 return exs !=null && exs[0]!=null;	 
     }
}
