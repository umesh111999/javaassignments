package one;

import java.util.HashMap;
import java.util.Set;

public class Assignment86 {

    public static void main(String[] args) {

        HashMap<Integer,String > hashMap1 = new HashMap<>();

        hashMap1.put(1,"king");
        hashMap1.put(2,"queen");
        hashMap1.put(3,"minister");
        hashMap1.put(4,"worker");
        hashMap1.put(5,"buisiness");

        Set l = hashMap1.entrySet();
        StringBuilder str = new StringBuilder();

        l.forEach(str1->str.append(str1));

        System.out.println(str);

    }
}
