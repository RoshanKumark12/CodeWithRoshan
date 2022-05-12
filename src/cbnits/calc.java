package cbnits;

class A{
    int num1;
    int num2;
    int result;

    public void perform(){
        result=num1+num2;
    }
}
public class calc {
   public static void main(String[] args){
       A obj=new A();
       obj.num1=3;
       obj.num2=5;

       obj.perform();
       System.out.println(obj.result);
   }
}

