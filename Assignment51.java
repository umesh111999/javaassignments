package one;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Assignment51 {
	public static void main(String[] args) {
		HashMap<Integer,Double> keys = new HashMap<>();
		Scanner sn= new Scanner(System.in);
		for(int i =0;i<10;i++)
		{ 
			int key= sn.nextInt();
			Double value = sn.nextDouble();
			keys.put(key,value);
		}
     System.out.println("Mapped elements are: ");
     for(Map.Entry s : keys.entrySet()) {
    	 System.out.println(s.getKey()+" "+s.getValue());
     }
}
}