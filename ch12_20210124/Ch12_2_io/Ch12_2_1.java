/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_2_io;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_2_1 {

    /**
     * file
     */
    public static void main(String[] args) {
	// File 把路徑跟java程式碼合併在一起
	File file = new File("C:\\MyDir\\msg.txt");
	System.out.println(file.exists());
	System.out.println(file.isFile());
	System.out.println(file.isDirectory());
	System.out.println("================");
	File dirFile= new File("C:\\MyDir\\Dir1");
	System.out.println(dirFile.isFile());
	System.out.println(dirFile.isDirectory());
	File file2 = new File("C:\\MyDir\\myfile.txt");
	    
	    if(!file2.exists()){
		try{
		    file2.createNewFile();
		}catch(IOException ex){
		    
		}		
	    }
	
    }
    
}
