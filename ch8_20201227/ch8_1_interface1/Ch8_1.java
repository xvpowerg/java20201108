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
public class Ch8_1 {

    public static void testRun(Run run){
	run.runing();
    }

// 類別只能單一繼承 但可實作多個介面
// 介面與介面的關係是繼承 且可多重繼承    
    
//BirdIF  鳥介面 是一群動作的群組    
    public static void main(String[] args) {
	Bird bird = new Bird();
	testRun(bird);
//	Fly fly = bird;
//	fly.flying();
//	
//	Run run = bird;
//	run.runing();
	
	BirdIF  bird2 = new Chocobo();
	bird2.flying();
	bird2.runing();
	testRun(bird2);
	
    }
    
}
