package one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Assignment85 {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("rana");
        list1.add("nithish");
        list1.add("russel");
        list1.add("yadav");
        list1.add("ambati");

        System.out.println("Before using the replaceALL:");
        System.out.println(list1);

        list1.replaceAll(str->str.toUpperCase());
        System.out.println("After using the replace all: ");
        System.out.println(list1);
    }

}

