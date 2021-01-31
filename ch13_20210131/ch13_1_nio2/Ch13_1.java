/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class Ch13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
	//Paths 取得路徑
       Path path =  Paths.get("c:", "mydir","nio2.txt");
       System.out.println(path);
       //當地一參數為root不算在name數量內
       System.out.println(path.getName(1));
         System.out.println(path.getNameCount());
	 //c:\
        System.out.println(path.getRoot());
	Path path1 = Paths.get("c:","mydir");
	Path path2 = Paths.get("images","image1.png");
	//resolve
	Path path3 = path1.resolve(path2);
	System.out.println("path3:"+path3);	
	//合併時時用上一層
	Path path4 = Paths.get("image2.png");	
	Path path5 = path3.resolveSibling(path4);
	System.out.println("path5:"+path5);
	  //System.out.println(path.resolve(path));
	  //resolve 有root就會取代 左邊的路徑
	Path path6 = Paths.get("c:","mydir");
	Path path7 = Paths.get("d:","images");  
	Path path8 = path6.resolve(path7);
	System.out.println(path8);
    }
    
}
