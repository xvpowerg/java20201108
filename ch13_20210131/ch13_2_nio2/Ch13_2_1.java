/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_2_nio2;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
public class Ch13_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path pathSrc1 = Paths.get("c:","mydir","nio2.txt");
	Path pathSrc2 = Paths.get("c:","mydir","nio2_byte.txt");
	//String
	ArrayList<String> list = new ArrayList();
	list.add("工作細胞");
	list.add("只有我能進入的隱藏迷宮");
	list.add("咒術回戰");
	String msg = "回復術士的重啟人生!!!";
	try{
	    Files.write(pathSrc1, list);
	    Files.write(pathSrc2, msg.getBytes());
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
