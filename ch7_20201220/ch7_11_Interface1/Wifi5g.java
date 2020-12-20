/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_11_Interface1;

//基本介面方法是抽象
//介面所有方法預設都是public
public interface Wifi5g {
    //public abstract void input(String st);
    //以上可簡寫如下
    void input(String st);
    String output();
    float getHz();
    
}
