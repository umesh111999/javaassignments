package one;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment52 {
	public static final <T> void swap (T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
		}
		private static void test() {
			Scanner sc = new Scanner(System.in);
			String a[] = {"Hello","Goodbye"};
			swap(a, 0, 1);
			System.out.println("a:"+Arrays.toString(a));
			
		}
		public static void main(String...args)
		{
		test();
		}

}