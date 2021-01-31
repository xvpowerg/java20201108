/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_2_nio2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch13_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path pathSrc1 = Paths.get("c:","mydir","nio2.txt");
	try{
	  List<String> list =  Files.readAllLines(pathSrc1);    
	  list.stream().forEach(System.out::println);
//	  for (String str : list){
//	      System.out.println(str);
//	  }
	}catch(IOException ex){
	    System.out.println(ex);
		    
	}
	
    }
    
}
