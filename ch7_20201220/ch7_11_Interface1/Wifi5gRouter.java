/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_11_Interface1;

/**
 *
 * @author xvpow
 */
public class Wifi5gRouter implements Wifi5g {
    private String data;
    public void input(String in){
	data = in;
	System.out.println("輸入:"+in);
    }
    public String output(){
	return "輸出Wifi資訊:"+data;
    }
    public float getHz(){
	return 5.0f;
    }
}
