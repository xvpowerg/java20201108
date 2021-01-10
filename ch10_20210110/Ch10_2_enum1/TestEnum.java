/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_2_enum1;

/**
 *
 * @author xvpow
 */
public class TestEnum {
    public static final int PLAY = 1;
    public static final int STOP = 2;
    public static final int EXIT = 3;
    public enum Action{
	PLAY,
	STOP,
	EXIT
    }
    //10個以下使用列舉
    public static void testRun2(Action action){
	switch(action){
	    case PLAY:
		  System.out.println("播放");
		break;
	    case STOP:
		System.out.println("停止");
		break;
	    case EXIT:
		System.out.println("離開");
		break;
	}
    }
    //數量多用常數 因為常數使用基本型態 較節省記憶體空間
   public static void testRun(int action){
       switch(action){
	   case PLAY:
	       System.out.println("播放");
	       break;
	   case STOP:
	       System.out.println("停止");
	       break;
	   case EXIT:
	        System.out.println("離開");
	       break;
       }
   } 
}
