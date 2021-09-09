package one;
import java.util.Scanner;
public class Assignment53 {
	public static void main(String[] args){
		Pair1<String,String>obj = new Pair1<>();
	 	Scanner sn = new Scanner (System.in);
		String object1 = sn.nextLine();
		obj.setKey(object1);
		System.out.println(obj.getKey());
		String object2 = sn.nextLine();
		obj.setValue(object2);
		System.out.println(obj.getValue());
	}
}
  class Pair1<K,V>{
	  K key;
	  V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}