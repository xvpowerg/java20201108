/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_3_Serialization;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
//物件可序列化必須實做Serializable
public class Item implements Serializable{
    private String name;
    private int value;

    public Item(String name, int value) {
	this.name = name;
	this.value = value;
    }

    public String getName() {
	return name;
    }

    public int getValue() {
	return value;
    }

    @Override
    public String toString() {
	return "Item{" + "name=" + name + ", value=" + value + '}';
    }
    
    
	    
}
