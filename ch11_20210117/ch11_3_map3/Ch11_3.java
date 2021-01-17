/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210117.ch11_3_map3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Ch11_3 {
    private static class Student{
	    private String name;
	    private int score;

	public Student(String name, int score) {
	    this.name = name;
	    this.score = score;
	}

	public String getName() {
	    return name;
	}

	public int getScore() {
	    return score;
	}

	@Override
	public String toString() {
	    return "Student{" + "name=" + name + ", score=" + score + '}';
	}	
    }    
//    static void totalToMap(Student st,Map<String,Integer> map){
//	String key = st.getName();
//	int total = st.getScore();
//	if (map.containsKey(key)){
//	    total +=  map.get(key);
//	}
//	map.put(key, total);
//    }    
    
//      static void totalToMap(Student st,Map<String,Integer> map){	  
//	  map.merge(st.getName(),st.getScore(), (ov,nv)->ov+nv);
//      }
    
         static void totalToMap(Student st,Map<String,Integer> map){
	      
	      map.computeIfPresent(st.getName(), (k,o)->o+st.getScore());
             map.computeIfAbsent(st.getName(), k->st.getScore());
      }
    
    public static void main(String[] args) {
	Student st1 = new Student("Ken",60);
	Student st2 = new Student("Vivin",85);
	Student st3 = new Student("Lindy",70);
	Student st4 = new Student("Ken",80);
	Student st5 = new Student("Lindy",71);
	Student st6 = new Student("Vivin",20);
	//幫我將Student 加入List
	//使用Map 幫我計算每位學生的總成績 K:姓名 V:成績	
	ArrayList<Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	HashMap<String,Integer> map = new HashMap<>();
	list.forEach(st->totalToMap(st,map));	
	System.out.println(map);
    }
    
}
