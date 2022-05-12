package cbnits;

class Hybrid {
    Hybrid()
    {
        System.out.println("constructor of class hybrid");
    }
}
class Sub1 extends Hybrid{
    Sub1()
    {
        System.out.println("constructor of class a");
    }
}
class Sub2 extends Hybrid{
    Sub2()
    {
        System.out.println("constructor of class b");
    }
}
class Main extends Sub1 {
    void bc()
    {
        System.out.println("constructor of class c");
    }
    public static void main(String[] args) {
        Main r=new Main();
    }
}


