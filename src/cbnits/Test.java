package cbnits;

public class Test {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a=10,b=0,c;
        try{
            c=a/b; //c=10/0
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("can't divide by zero "+e);
        }
        System.out.println("main method ended");
    }
}
