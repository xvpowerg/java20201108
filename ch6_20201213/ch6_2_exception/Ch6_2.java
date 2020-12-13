/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_2_exception;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

//什麼是例外
 //當程式碼發生可預期或不可預期 不正常情況時,一種強制訊息
 //強制的意思是會中斷程式碼   
    public static void main(String[] args) {
	/*Employee emp = 
	new Employee("Ken",10,178);
	emp.printInfo();
	emp.setAge(900);
	emp.printInfo();*/
	
	/*Employee emp2 = 
	new Employee("Vivin",15,178);
	emp2.printInfo();*/
	
	Employee emp3 = new Manager("Lucy",35,165);
	Employee emp4 = new Sales("Bom",25,180);
	emp3.printInfo();
	emp4.printInfo();
	
//	System.out.print(emp3.getName()+":"+emp4.getName());
	
	
    }
    
}
