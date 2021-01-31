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
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch13_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path pathSrc1 = Paths.get("c:","mydir");
	try{
	    //只會讀目錄到Integer.MAX_VALUE 層
	   //Stream<Path> pathList =   Files.walk(pathSrc1);
	   //0層 當前目錄
	   Stream<Path> pathList =   Files.walk(pathSrc1,10000);
	   pathList.forEach(System.out::println);
	}catch(IOException ex){
	   System.out.println(ex);
	}

    }
    
}
