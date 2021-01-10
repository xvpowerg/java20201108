/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210110.Ch10_3_list;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch10_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	LinkedList<String> list = new LinkedList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Joy");
	list.add("Iris");
	list.forEach(s->System.out.println(s));
	
	
	
	
    }
    
}
