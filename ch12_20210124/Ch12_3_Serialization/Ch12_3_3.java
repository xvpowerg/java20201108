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
/**
 *
 * @author xvpow
 */
public class Ch12_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
	File file = new File("C:\\MyDir\\item.obj");
	Item item = new Item("A1",100);
	try(FileOutputStream out = new FileOutputStream(file);
	ObjectOutputStream objOut = new ObjectOutputStream(out);){
	    objOut.writeObject(item);
	}
    }
    
}
