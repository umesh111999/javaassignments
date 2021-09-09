package one;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info{
	int AuthorId();  
	String developersName();
	String developerSupervisor();
	String date(); 
	String time() ;
	int version();
	
}
public class Assignment72 {
	public static void main(String[] args) throws Exception {
		Developers developer1 = new Developers();
		Class d =developer1.getClass();
		Annotation annotation = d.getAnnotation(Info.class);
		Info s = (Info)annotation;
		System.out.println(s.AuthorId());
	
	}
}
@Info(AuthorId=0,developersName="ddscbdhc",developerSupervisor="jdnjnc",date="22",time="edd",version=0)
class Developers{
   
	  public void Method(){
	        System.out.println("Hello");
	    }
	
   
    
   
}
