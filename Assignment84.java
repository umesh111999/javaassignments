package one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment84 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("perry");
        list1.add("yuvraj");
        list1.add("sehwag");
        list1.add("kl");
        list1.add("rahul");
        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
        System.out.println("list of elements: ");
        displaylist.accept(list1);
        StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list1);

        System.out.println("String first letter of list elements:");
        System.out.println(s1);


    }
}
