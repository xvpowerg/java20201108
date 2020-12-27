/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_2_interface2;

/**
 *
 * @author xvpow
 */
public class Student implements ObjToStringArray {
    private String name;
    private int[] score ;
   public Student(String name,int... score){
	this.name = name;
	this.score = score;
    }
   
   public String[] objToStringArray(){
       String[] values = new String[score.length+1];
       values[0]= name;
       for (int i=1; i<values.length ; i++){
	    values[i] = score[i-1]+"";
       }
       return values;
   }
}
