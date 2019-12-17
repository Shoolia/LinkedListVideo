package linkedList;

import java.util.Iterator;

public class Main {



    public static void main(String[] args) {

        LinkedContainer<String> stringLinked = new LinkedContainer<>();

        stringLinked.addLast("first");
        stringLinked.addLast("second");
        stringLinked.addLast("third");

        stringLinked.addFirst("zero");

        stringLinked.addFirst("negative");

        for (String s : stringLinked) {
            System.out.println(s);
        }


        Iterator iterator = stringLinked.descendingIterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



}