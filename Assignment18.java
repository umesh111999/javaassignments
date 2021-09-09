package one;
import java.util.Scanner;

import java.io.*;
import java.util.*;
public class Assignment18
{
	public static void main(String[] args) {
	    int avg=0,a=0,b=0,c=0,sum=0;
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<3;i++){
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int o = sc.nextInt();
	        a = a+m;
	        b = b+n;
	        c = c+o;
	        avg = avg+m+n+o;
	    }
	    System.out.println(avg/3);
	    System.out.println(a/3+","+b/3+","+c/3);
	    
	}
}
