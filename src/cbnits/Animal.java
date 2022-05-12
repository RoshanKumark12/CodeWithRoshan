package cbnits;

abstract class Animal {
    Animal()
    {
        System.out.println("All animals....!");
    }
    public abstract void sound();
}
class Dog extends Animal{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}
class Lion extends Animal{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Lion is Roar");
    }
}
class Demo1{
    public static void main(String[] args) {
        Dog r=new Dog();
        Lion l=new Lion();

        r.sound();
        l.sound();
    }
}
