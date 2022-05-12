package cbnits;

interface Abc
{
    void show();
}
public class InterfaceDemo
{
    public static void main(String[] args) {
        Abc r=() -> System.out.println("Im the best");
        r.show();
    }
}
