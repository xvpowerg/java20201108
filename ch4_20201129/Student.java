/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129;

/**
 *
 * @author xvpow
 */
public class Student {
    //屬性 Attributes
    String classNumber;
    String name;
    String id;
    int[] scores = new int[5];
    //Student的動作
    void printStudent(){
	System.out.printf("姓名:%s 班級:%s 學號:%s "
		+ "成績1:%2d 成績2:%2d 成績3:%2d 成績4:%2d 成績5:%2d %n",
		name,classNumber,id ,scores[0] ,
		scores[1],
		scores[2],
		scores[3],
		scores[4]);
    }
    
    int getSumScore(){
	int sum = 0;
	for (int s : scores){
	    sum += s;
	}
	return sum;
    }
    
    void printSumScore(){
	System.out.printf("學生:%s 成績加總:%d%n",name,getSumScore());
    }
}
