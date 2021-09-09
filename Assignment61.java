package one;
import java.util.TreeMap;
public class Assignment61 {
	public static void main(String[] args) {
		
		TreeMap<Long,String> map=new TreeMap<Long,String>();
		map.put((long) 131, "sai");
		map.put((long) 132, "rishi");
		map.put((long) 133, "taman");
		System.out.println("all the keys: "+map.keySet());
		System.out.println("all the values: "+map.values());
		System.out.println("all key-value pairs: "+map.keySet()+map.values());
		System.out.println("descendingMap: "+map.descendingMap());
	}

}