package one;
import java.util.Scanner;
public class Assignment53 {
	public static void main(String[] args){
		Pair1<String,String>obj = new Pair1<>();
	 	Scanner ys = new Scanner (System.in);
		String obj1 = ys.nextLine();
		obj.setKey(obj1);
		System.out.println(obj.getKey());
		String obj2 = ys.nextLine();
		obj.setValue(obj2);
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