/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210124.Ch12_1_stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Ch12_1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Stream<Integer> intStream = Stream.of(5,8,9,11);
	Optional<Integer> opt =  intStream.reduce((v1,v2)->{	    
	    System.out.println(v1+":"+v2);
	return v1+v2;
	});
	System.out.println(opt.get());
	
	Stream<String> urlStream = 
		Stream.of("www.howard.com","view","user");
	//https://www.howard.com/view/user
	String url = urlStream.reduce("https:/", (v1,v2)->{
	    System.out.println(v1+"==="+v2);
	    return v1+"/"+v2;});
	System.out.println(url);
	
	
	Stream<Integer> intStream2 = Stream.of(1,2,3);
	//parallel 時 combiner 才會執行到 會先在accumulator 做好預處理	
	//在於combiner合併
//1 + 1 =2
//1 + 2 =3 
//1 + 3 =4
//2+3+4 = 9
	int sum2 = intStream2.parallel().reduce(1, (v1,v2)->{
		System.out.println("acc:"+v1+":"+v2);
		return v1+v2;
	},(v1,v2)->{
	    System.out.println("cam"+v1+":"+v2);
	    return v1+v2;
	} );
	System.out.println(sum2);
	
    }
    
}
