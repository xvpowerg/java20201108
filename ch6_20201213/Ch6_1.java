/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201213;

public class Ch6_1 {

    static void testInsert(SQLTest sql){
	sql.insert();
    }
    
    static void testUpdate(SQLTest sql){
	sql.update();
    }
    
    static void testDelete(SQLTest sql){
	sql.update();
    }
    
    public static void main(String[] args) {
	SQLTest ms = SqlFactory.getSqlObj();
	testInsert(ms);
	testUpdate(ms);
	testDelete(ms);
    }
    
}
