package one;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Assignment62 {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<>();
		obj.add("gun");
		obj.add("knife");
		obj.add("arrow");
		obj.add("sword");
		obj.add("cake");
		obj.add("Silver");
		obj.add("bun");
		obj.add("cake");
		obj.add("pin");
		obj.add("perry");
		obj.add("perry");
		//creating HashSet and adding objects
		HashSet<String> set=new HashSet<String>(obj);
		set.add("king");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}