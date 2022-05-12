package cbnits;

public class a {
    int a,b,c;
    void add(){
        a=10; b=20;
        c=a+b;
        System.out.println("sum of two number "+c);
    }
    void sub(){
        a=200; b=100;
        c=a-b;
        System.out.println("sub of two number "+c);
    }
}
class b extends a{
    void multi(){
        a=200; b=100;
        c=a*b;
        System.out.println("multiplication of two number "+c);
    }
    void div(){
        a=200; b=100;
        c=a/b;
        System.out.println("Division of two number "+c);
    }
}
class c extends b{
    void rem(){
        a=10; b=3;
        c=a%b;
        System.out.println("Remainder of two number "+c);
    }

    public static void main(String[] args) {
        c r=new c();
        r.add(); r.sub(); r.multi(); r.div(); r.rem();
    }
}
