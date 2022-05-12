package cbnits;

import java.util.Scanner;
interface Client{
    void input(); //public+abstract
    void output(); //public+abstract
}
class Interface implements Client {
    String name; double sal;
    @Override
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        name=sc.nextLine();
        System.out.println("Enter Salary: ");
        sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        Client c=new Interface();
        c.input();
        c.output();
    }
}
