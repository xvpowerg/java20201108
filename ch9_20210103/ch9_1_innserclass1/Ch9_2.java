/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_1_innserclass1;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
public class Ch9_2 {

   static class MyPrint implements Consumer<String>{
       public void accept(String st){
	   System.out.println(st);
       }
   }
   
   static class ToFile implements  Consumer<String>{
       public void accept(String st){
	   Path path = Paths.get("c:", "MyDir","test.txt");
	   try{
	       Files.write(path, st.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	   }catch(Exception ex){
	       System.out.println(ex);
	   }
	   
       }
   } 
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	Consumer<String> mp = new MyPrint();
	list.forEach(mp);
//	Consumer<String> mp = new ToFile();
//	for (String s : list){
//	  mp.accept(s);
//	}
    }
    
}
