package one;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Assignment51 {
	public static void main(String[] args) {
		HashMap<Integer,Double> keys = new HashMap<>();
		Scanner ys = new Scanner(System.in);
		for(int i =0;i<10;i++)
		{ 
			int key= ys.nextInt();
			Double value = ys.nextDouble();
			keys.put(key,value);
		}
     System.out.println("Mapped elements are: ");
     for(Map.Entry m : keys.entrySet()) {
    	 System.out.println(m.getKey()+" "+m.getValue());
     }
}
}