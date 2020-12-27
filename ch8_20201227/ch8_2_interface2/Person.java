/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_2_interface2;

/**
 *
 * @author xvpow
 */
public class Person  implements ObjToStringArray {
  public   Person(String name,String addrs){
	this.name = name;
	this.addrs = addrs;
    }    
    private String name;
    private String addrs;
    
    public String[] objToStringArray(){
	return new String[]{name,addrs};
    }
}
