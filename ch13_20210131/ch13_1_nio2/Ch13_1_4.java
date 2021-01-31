/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
public class Ch13_1_4 {

    /**
     * move
     */
    public static void main(String[] args) {
	Path pathSrc = Paths.get("c:","mydir","test.zip");
	Path pathTarget = Paths.get("c:","mydir","Dir2","testmove.zip"
		);
	try{
	    //Files.move 預設情況下如果名稱重複move出錯
	   //StandardCopyOption.COPY_ATTRIBUTES 不可用於Files.move
	    Files.move(pathSrc, pathTarget,
		    StandardCopyOption.REPLACE_EXISTING,
		StandardCopyOption.ATOMIC_MOVE
		);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
