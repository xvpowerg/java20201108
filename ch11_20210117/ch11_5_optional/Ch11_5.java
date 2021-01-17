/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_5_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_5 {
	
    static class Animal{
	    private String name;
	    private int age;


	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	@Override
	public String toString() {
	    return "Animal{" + "name=" + name + ", age=" + age + '}';
	}
	
	
	public Optional<String> getName() {
	    return Optional.ofNullable(name);
	}

	public void setName(String name) {
	    this.name = name;
	}

    }
    public static void main(String[] args) {
	Animal animl = new Animal();
	animl.setAge(10);
	animl.setName("BBB");
	animl.getName().ifPresent(
		n->System.out.println(n.length()));
//	if (animl.getName() != null){
//	    	int len = animl.getName().length();
//	System.out.println(len);
//	}
//Optional 希望可以取代null

	
	
    }
    
}
