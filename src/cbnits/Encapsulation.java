package cbnits;

public class Encapsulation {
    private int value; //data hiding
    public void setValue(int x)  //data abstraction
    {
        value=x;
    }
    public int getValue()
    {
        return ++value;
    }
}
class Encapsulation1{
    public static void main(String[] args) {
        Encapsulation r=new Encapsulation();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}
