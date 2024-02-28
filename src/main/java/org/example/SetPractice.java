package org.example;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
//        Set<String> names=new HashSet<String>();
//        names.add("Prince");
//        names.add("Amit");
//        names.add("Rakesh");
//        names.add("Sumit");
//        names.add("Ishan");
//        System.out.println("unordered names using HashSet");
//        System.out.println(names);
//
//
//        Set<String> orderedNames=new LinkedHashSet<>();
//        orderedNames.add("Prince");
//        orderedNames.add("Amit");
//        orderedNames.add("Rakesh");
//        orderedNames.add("Sumit");
//        orderedNames.add("Ishan");
//        System.out.println("ordered names using Linked HashSet");
//        System.out.println(orderedNames);

        Set<String> sortedNames=new TreeSet<>();
        sortedNames.add("Prince");
        sortedNames.add("Amit");
        sortedNames.add("Rakesh");
        sortedNames.add("Sumit");
        sortedNames.add("Ishan");
        System.out.println("sorted names using TreeSet");
        System.out.println(sortedNames);

//        for(String name: sortedNames){
//            System.out.println(name);
//        }

       Iterator<String> iterator= sortedNames.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }




    }
}
