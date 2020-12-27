/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201227.ch8_10_fcunc_consumer;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TestConsumer implements Consumer<String> {
    public void accept(String obj){
	System.out.println(obj);
    }
}
