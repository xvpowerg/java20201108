/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201206.ch5_4_override;

/**
 *
 * @author xvpow
 */
public class Tiger  extends Animal {
    private float weight;
    public Tiger(String name,int age,
	    float height,float weight){
	super(name,age,height);
	this.setWeight(weight);	
    }
    public void setWeight(float weight){
	this.weight = weight;
    }
    
    public float getWeight(){
	return weight;
    }
    //Override
    //@Override 驗證是否為正確覆寫
    @Override
    public void printInfo(){
	//super.呼叫父類別的函數
	super.printInfo();
	System.out.
		printf(" Weight:%.2f%n",getWeight());
    }
    
}
