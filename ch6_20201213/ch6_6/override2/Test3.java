/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_6.override2;

import java.io.IOException;
import ch6_20201213.ch6_4_exception3.InputEmptyException;

public class Test3 extends Test1 {
    //雖然InputEmptyException 不是 IOException子類型 但他是非必要例外檢測
    //所以可以throws
    public void testExcOverride()throws InputEmptyException{
	System.out.println("testExcOverride Test1");
	throw new InputEmptyException("");
    }
}
