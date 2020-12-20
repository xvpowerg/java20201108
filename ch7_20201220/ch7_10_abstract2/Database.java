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
//抽象類別不可是final
//類別不可被繼承
public  abstract class Database {
    private String ip;
    private String name;
    public Database(String ip,String name){
	this.ip = ip;
	this.name = name;
    }
    //抽象的方法一定在抽象類內
    //提醒開發人員必須覆寫
    //抽象方法不可私有
    //抽象方法不可final (方法final表示不可複寫)
    public abstract String getSqlType();
    
    public String connection(){
	String type = getSqlType();	
	String url = String.format("%s:/%s/%s",type,ip, name);
	return url;
    }
    //oracle:/ip/name
}
