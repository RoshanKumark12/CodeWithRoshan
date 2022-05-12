package cbnits;

public class Npe {
    public static void main(String[] args) {
        String str=null;
        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n)
        {
            System.out.println("null can't be casted");
        }
    }
}
