package one;

public class Assignment81 {

	public static void main(String[] args) {
		addinf funadd = (a,b)-> a+b;
		addinf fundiv = (a,b) -> a/b;
		addinf funsub = (a,b) -> a-b;
		addinf funmul = (a,b) -> a*b;
		
		int a = funadd.call(8, 8);
		int l = fundiv.call(8, 8);
		int m = funsub.call(8, 8);
		int n = funmul.call(8, 8);
		System.out.println("lambda functions");
		System.out.println("addition");
		System.out.println(a);
		System.out.println("division");
		System.out.println(l);
		System.out.println("sub");
		System.out.println(m);
		System.out.println("mult");
		System.out.println(n);
		

	}

	
	interface addinf{
		int call(int a, int b);

	}

}
