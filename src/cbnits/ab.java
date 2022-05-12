package cbnits;

public class ab {
    void input()
    {
        System.out.println("Enter your name: ");
    }
}
class ab1 extends ab{
    void Show()
    {
        System.out.println("My name is Ankit ");
    }
}
class ab2 extends ab{
    void Disp()
    {
        System.out.println("My name is Ankush ");
    }
    public static void main(String[] args) {
        ab1 r=new ab1();
        ab2 r1=new ab2();

        r.input(); r.Show();
        r1.input(); r1.Disp();
    }
}


