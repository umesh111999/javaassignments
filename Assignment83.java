package one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Assignment83 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("wang");
        list1.add("spider man");
        list1.add("wang lee");
        list1.add("wang shee");
        list1.add("wang ma");
        list1.add("wang lo");
        list1.add("wang tho");
        list1.removeIf(s->s.length()%2!=0);

        list1.forEach(System.out::println);

    }

}

