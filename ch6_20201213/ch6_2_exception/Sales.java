/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_2_exception;

public class Sales  extends Employee{
    public Sales(String name,int age,float height){
	super(name,age,height);
    }
    
    public void printInfo(){
	System.out.print("Sales: ");
	super.printInfo();
    }
    
}
