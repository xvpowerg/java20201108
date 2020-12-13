/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_7.initblock;

/**
 *
 * @author xvpow
 */
public class NotStaticBlock {
    private String[]name = new String[500000];
    private int size = 0;
	
     //非靜態初始化區塊
    //所有建構子都需要做的事放到這個區塊
    {
    System.out.println("Test Block!!");
	for (int i =0;i<name.length;i++){
	    name[i] = "";
	}
    }
    //可以在建構是做初始化
    public NotStaticBlock(){ 
	System.out.println("Test NotStaticBlock()");
    }
    
    public NotStaticBlock(int size){
	System.out.println("Test NotStaticBlock(int)");
	this.size = size;
    }
   
    //希望name陣列填入空白字串
    public int indexOf(String str){
	for (int i =0;i <name.length ;i++){
		if (name[i].equals(str)){
		    return i;	
		}
	}
	return -1;

    }

}
