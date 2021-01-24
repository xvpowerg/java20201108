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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class Ch12_2_3 {


    public static void main(String[] args) {
	
	File src = new File("C:\\MyDir\\test.zip");
	File target = new File("C:\\MyDir\\test_copy.zip");
	
	try(InputStream input  = new BufferedInputStream(new FileInputStream(src));
	    OutputStream out = new BufferedOutputStream(new FileOutputStream(target));){	
	//try()    內宣告的變數不可重新指定
	//input = null;
	    //-1表示檔案讀完
	    int data = -1;
	    while( (data = input.read())!=-1 ){
		out.write(data);		
	    }	   		  
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
//	File src = new File("C:\\MyDir\\test.zip");
//	File target = new File("C:\\MyDir\\test_copy.zip");
//	   InputStream input = null;
//	   OutputStream out = null;
//	try{
//	    input = new FileInputStream(src);
//	    out = new FileOutputStream(target);
//	    input = new BufferedInputStream(input);
//	    out = new BufferedOutputStream(out);
//	    //-1表示檔案讀完
//	    int data = -1;
//	    while( (data = input.read())!=-1 ){
//		out.write(data);
//		    //System.out.println(data);
//	    }	   		  
//	}catch(FileNotFoundException ex){
//	    System.out.println(ex);
//	}catch(IOException ex){
//	    System.out.println(ex);
//	}finally{
//	    //一定會執行一次
//	    try{
//		 out.close();
//		input.close();
//	    }catch(IOException ex){
//		
//	    }
//	     
//	}
	
	
	
//		try{
//	    InputStream input = new FileInputStream(src);
//	    OutputStream out = new FileOutputStream(target);
//	    input = new BufferedInputStream(input);
//	    out = new BufferedOutputStream(out);
//	    //-1表示檔案讀完
//	    int data = -1;
//	    while( (data = input.read())!=-1 ){
//		out.write(data);
//		    //System.out.println(data);
//	    }	   	
//	    out.close();
//	    input.close();
//	}catch(FileNotFoundException ex){
//	    System.out.println(ex);
//	}catch(IOException ex){
//	    System.out.println(ex);
//	}
	
    }
    
}
