/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_2_io;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch12_2_2 {


    public static void main(String[] args) {
	
	File src = new File("C:\\MyDir\\myfile.txt");
	File target = new File("C:\\MyDir\\myfile_target.txt");
	
	try{
	    InputStream input = new FileInputStream(src);
	    OutputStream out = new FileOutputStream(target);
	    //-1表示檔案讀完
	    int data = -1;
	    while( (data = input.read())!=-1 ){
		out.write(data);
		    //System.out.println(data);
	    }	   	    
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
	
	
    }
    
}
