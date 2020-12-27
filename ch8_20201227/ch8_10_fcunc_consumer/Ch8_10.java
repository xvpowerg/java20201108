/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_10_fcunc_consumer;
import java.util.ArrayList;
public class Ch8_10 {

    public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList();
	list.add("Howard");
	list.add("Ken");
	list.add("Vivin");
	TestConsumer tc = new TestConsumer();
	list.forEach(tc);
	
    }
    
}
