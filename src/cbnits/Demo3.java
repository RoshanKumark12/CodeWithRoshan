package cbnits;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<String>();
        name.add("Ankit");
        name.add("Avi");
        name.add("Altaf");

        System.out.println(name);
        name.add("Akash");
        System.out.println(name);
        name.add(1,"Ramesh");
        System.out.println(name);
        name.add(0,"Amir");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        name.set(1,"Roshan");
        System.out.println(name);
        System.out.println(name.get(2));
        name.clear();
        System.out.println(name);


    }
}
