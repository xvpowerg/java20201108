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
public class MySQL  extends Database{
    public MySQL(String ip,String name){
	super(ip,name);
    }
   public String getSqlType(){
       return "mysql";
   }   
}
