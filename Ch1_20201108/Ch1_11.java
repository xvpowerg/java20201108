/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20201108;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//null 表示空無一物
	
	String name = "Ken";
	//name 如果是ｎｕｌｌ會拋出java.lang.NullPointerException
	//toLowerCase 字串變小寫
	switch(name.toLowerCase()){
	    case "vivin":
		System.out.println("業務");
		break;
	    case "ken":
		System.out.println("經理");
		break;
	    case "lucy":
		System.out.println("採購");
		break;
	    default:
	        System.out.println("錯誤");
	}
	
    }
    
}
