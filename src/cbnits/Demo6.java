package cbnits;

import java.util.ArrayDeque;

public class Demo6 {
    public static void main(String[] args) {
        ArrayDeque<String> name=new ArrayDeque<>();  //FIFO
        name.push("Ankit");
        name.push("Avi");
        name.push("Altaf");
        System.out.println(name);
        name.pop();
        System.out.println(name);
    }
}
