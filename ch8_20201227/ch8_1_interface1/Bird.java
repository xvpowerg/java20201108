/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_1_interface1;

/**
 *
 * @author xvpow
 */
public class Bird implements Fly,Run{
    public void flying(){
	System.out.println("鳥飛!!");
    }
    public void runing(){
	System.out.println("鳥跑!!");
    }
}
