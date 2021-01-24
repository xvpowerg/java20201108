/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_3_Serialization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch12_3_1 {

    /**
     *序列化 把物件變檔案
     */
    public static void main(String[] args) {
	List<String> myList = new ArrayList();
	myList.add("Howard");
	myList.add("Ken");
	myList.add("Vivin");
	myList.add("Lucy");
	File file = new File("C:\\MyDir\\mylsit.obj");
	try(FileOutputStream out = new  FileOutputStream(file);
	   ObjectOutputStream objOut = new ObjectOutputStream(out)){
	    objOut.writeObject(myList);	    
	}catch(IOException ex){
	    System.out.println(ex);
	}	
    }    
}
