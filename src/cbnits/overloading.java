package cbnits;

public class overloading {
    int a,b,c;
    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        overloading r=new overloading();
        r.add();
        r.add(100,200);
        r.add(50,45.32d);
    }
}
