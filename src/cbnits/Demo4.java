package cbnits;

import java.util.LinkedList;

public class Demo4 {
    public static void main(String[] args) {
        LinkedList<String> name=new LinkedList<String>();
        name.add("Ankit");
        name.add("Avi");
        name.add("Altaf");
//        System.out.println(name);
//
//        name.addFirst("Rocky");
//        name.addLast("Rakesh");
//        System.out.println(name);
//        name.add(3,"Rajesh");
//        System.out.println(name);
//        name.remove(1);
//        System.out.println(name);
//        name.removeFirst();
//        System.out.println(name);
//        name.removeLast();
//        System.out.println(name);

        for (String str:name)
        {
            System.out.println(str);
        }
    }
}
