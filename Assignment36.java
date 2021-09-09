package one;

public class Assignment36 {

	public static void main(String[] args) {
		String s1= "Java String pool is known as collection of Strings which are stored in heap memory";
		System.out.println("After changing case is : " + s1.toLowerCase());
		System.out.println("After Lower case is : " + s1.toUpperCase());
		String s3="collection";
		System.out.println(s1.contains(s3));
		s1=s1.replace('a', '$');
		System.out.println("replacing the a with $ in given string :" +s1);
		String s2 ="Java String pool is known as collection of String which are stored in heap memory";
		System.out.println("check : " + (s1.equals(s2)));
        System.out.println("search:" +(s1.substring(9)));

	}

}
