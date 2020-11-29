/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201129;

import ch4_20201129.Ch4_2.Product;


public class Ch4_1 {
    // Class
    //共同的特徵
    //收集共同的特徵
    //特徵 包含了
    // 功能(思考 創作 進食 呼吸) 與 屬性(身高 體重 )
    // Object
    //依照類別創造出的個體
    public static void main(String[] args) {
	// TODO code application logic here
	//宣告一個可以存Student 記憶體位置的變數 名稱為st1
	Student st1;
	//new Student(); 真的建立物件分配記憶體空間
	st1 = new Student();
	
	st1.classNumber = "大黃班";
	st1.id = "A0001";
	st1.name = "Vivin";
	st1.scores[0] = 95;
	st1.scores[1] = 75;
	st1.scores[2] = 35;
	//希望印出 
	//姓名:Vivin 班級:大黃班 學號:A0001  成績1:95 成績2:75 成績3:35 
					//  成績4:0 成績5:0
	//動作印出學生成績
	st1.printStudent();
	//動作印出學生成績加總
	st1.printSumScore();
	
	Student st2 = new Student();
	st2.name = "Ken";
	st2.classNumber = "草莓班";
	st2.id ="S0005";
	st2.scores[0] = 95;
         st2.scores[3] = 67;

		//動作印出學生成績
	st2.printStudent();
	

    }
    
}

