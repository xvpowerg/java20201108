/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201220.ch7_10_abstract2;

/**
 *
 * @author xvpow
 */
public class Ch7_10  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//pgsql
	Database database = 
		new Pgsql("168.3.5.6","asdf");
	String url = database.connection();
	System.out.println(url);
	
	// pgsql:/168.3.5.6/asdf
    }
    
}
