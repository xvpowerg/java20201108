/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch13_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path path1 = Paths.get(".","..","Dir2","Dir2_2");
	Path path2  = path1.normalize();
	System.out.println(path2);
	
       Path path3 = Paths.get("c:",".","..","Dir2","Dir2_2");
       System.out.println(path3);
	Path path4  = path3.normalize();
	System.out.println(path4);
	
	Path path5 = Paths.get("c:","A","B","C");
	Path path6 = path5.subpath(0, 2);
	System.out.println(path6);
	
    }
    
}
