/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210131.ch13_4_thread;

/**
 *
 * @author xvpow
 */
public class Ch13_4_2 {

    static class Test1{
	  int x = 0;	
	public void add(){
	
	    for (int i =1;i<=5;i++){
		System.out.println(Thread.currentThread().getName());
		synchronized(this){
		    System.out.println("1 synchronized:"+Thread.currentThread().getName());
		    x++;
		   System.out.println(x);
		   System.out.println("2 synchronized:"+Thread.currentThread().getName());
		}		 
	    }
	}
	
    }
    public static void main(String[] args) {
	Test1 t1 = new Test1();	
	
	Thread th1 = new Thread(()->t1.add());
	Thread th2 = new Thread(()->t1.add());
	th1.start();
	th2.start();
    }
    
}
