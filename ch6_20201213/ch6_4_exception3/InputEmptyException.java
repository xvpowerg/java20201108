/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_4_exception3;

//非必要檢測的例外
public class InputEmptyException 
	extends RuntimeException {
    public InputEmptyException(String msg){
	super(msg);
    }
}
