/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_3_Serialization;

import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Ch12_3_2 {
    /**
     * 反序列化
     */
    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\mylsit.obj");	
	try(FileInputStream input = new FileInputStream(file);
	   ObjectInputStream objIn = new ObjectInputStream(input);	){
	   ArrayList<String> list = (ArrayList)   objIn.readObject();
	    System.out.println(list);
	   //| 寫catch 條件 不可繼承關係
	}catch(IOException | ClassNotFoundException ex){
	    System.out.println(ex);
	}	
    }    
}
