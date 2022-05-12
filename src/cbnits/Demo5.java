package cbnits;

import java.util.Stack;

public class Demo5 {
    public static void main(String[] args) {
        Stack<String> name=new Stack<String>();  //LIFO
        name.push("Ankit");
        name.push("Avi");
        name.push("Altaf");
        System.out.println(name);
        name.pop();
        System.out.println(name);
    }

}
