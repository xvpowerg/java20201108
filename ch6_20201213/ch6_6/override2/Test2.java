/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213.ch6_6.override2;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    //覆寫可選
    //拋出一樣
    //拋出子類
    //不拋
      public void testExcOverride()throws FileNotFoundException{
	System.out.println("testExcOverride Test2");
	
    }
}
