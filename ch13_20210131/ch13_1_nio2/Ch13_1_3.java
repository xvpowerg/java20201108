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
/**
 *
 * @author xvpow
 */
public class Ch13_1_3 {

    /**
     * Copy
     */
    public static void main(String[] args) {
	Path pathSrc = Paths.get("c:","mydir","test.zip");
	Path pathTarget = Paths.get("c:","mydir","test_copy.zip");
	try{
	    //Files.copy 預設情況下如果名稱重複copy出錯
	    //Files.copy 不可使用 StandardCopyOption.ATOMIC_MOVE	    
	    Files.copy(pathSrc, pathTarget,		
		    StandardCopyOption.REPLACE_EXISTING);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
