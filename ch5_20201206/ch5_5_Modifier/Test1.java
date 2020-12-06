/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_5_Modifier;

/**
 *
 * @author xvpow
 */
public class Test1 {
    
    //public  全都可讀取
    //protected 相同package 或繼承時可讀取
    //default (空白)　相同package可讀取
    //private 只有目前類別可讀取
    
    public String publicValue = "public";
    protected String protectedValue = "protected";
    String defaultValue = "default";
    private String privateValue = "private";
    
    public void test1Public(){
	System.out.println("test1Public!!");
    }
      protected void test1Protected(){
	System.out.println("test1Protected!!");
    }
      
    void test1Default(){
	System.out.println("test1Default!!");
    }
    
    private void test1Private(){
	System.out.println("test1Private!!");
    }
}
