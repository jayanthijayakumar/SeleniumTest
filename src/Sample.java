import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sample {
public static void main(String[] args, int IndexOf) {
	List <Integer> li=new ArrayList<Integer>();
	//insert the value to the list
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		int size=li.size();
		System.out.println(size);
		//to find the index of
		int a=li.indexOf(li);
		System.out.println(a);
	    //int last = li.lastIndexOf(10);
		//System.out.println(last);
		//to fetch a particular value
		int integer=li.get(2);
		System.out.println(integer);
		//to insert the value
		li.add(1,10);
		System.out.println(li);
		//to remove the value
		int remove=li.remove(2);
		System.out.println(li);
		//to replace the value
		Integer set = li.set(2,26);
		
		System.out.println(li);
				
	

}
}

