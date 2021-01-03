/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210103.ch9_7.methodreference1;

/**
 *
 * @author xvpow
 */
public class Ch9_7 {
   //TestIF1 
   //Method Reference
    static void test1Method(){
			System.out.println("AAA");
			System.out.println("DD");
			System.out.println("BBB");
			System.out.println("EE");
			for (int i =1;i<=10;i++){
				System.out.println("FFF");
				System.out.println("KKK");
				System.out.println("AAA");
			}
    }
    
   //TestIF2 
    static void tets2Method(int x1,String d2){
	System.out.println(x1+":"+d2);
    }
   //TestIF3
    static MyClass test3Method(){
	return new MyClass();
    }
    
    static interface  TestIF1{
	void test1();
    }
    static void runTest1(TestIF1 t1){
	t1.test1();
    }
    
    static MyClass test4Method(int i1,String s2){
	return new MyClass(i1,s2);
    }
    static interface TestIF2{
	void test2(int v1,String s2);    
    }
    static interface TestIF3{
	MyClass test3();
    }
    
    static interface TestIF4{
	MyClass test4(int v1,String v2);
    }
    
    public static void main(String[] args) {
	  TestIF1 t1 = Ch9_7::test1Method;
	  runTest1(Ch9_7::test1Method);
	  //有傳2參數的
	 TestIF2 t2 = Ch9_7::tets2Method;
	  t2.test2(95, "Ken");
	  
	  TestIF3 tif3_1 = Ch9_7::test3Method;
	  //會呼叫建構式 會自動呼叫new MyClass
	  TestIF3 tif3_2 = MyClass::new;
	  
	  //
	  TestIF4 tif4_1= Ch9_7::test4Method;
	  //會呼叫傳int與String的建構式　
	  TestIF4 tif4_2=MyClass::new;
	  
	  System.out.println(tif4_1.test4(100, "VIvin"));
	  System.out.println(tif4_2.test4(50, "Lucy"));
    }
    //:: method reference語法
    //method reference 當 Lambda的實作內容很多時 會不好維護與閱讀
    //要改成method reference會比較好閱讀與維護
}
