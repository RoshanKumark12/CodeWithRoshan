package cbnits;

public abstract class Programming {
    public abstract void Developer();
}
class Html extends Programming{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends Programming{
    @Override
    public void Developer()
    {
        System.out.println("James Gosling");
    }
}
class Demo2{
    public static void main(String[] args) {
        Programming r=new Html();
        Programming s=new Java();
        r.Developer();
        s.Developer();
    }
}



