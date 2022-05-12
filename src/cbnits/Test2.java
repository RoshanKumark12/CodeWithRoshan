package cbnits;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sbf=new StringBuilder("Roshan");
        sbf.append("kumar");
        sbf.replace(0,6,"Manoj");
        sbf.delete(7,10);
        sbf.insert(1,"Rocky");
        sbf.reverse();
        System.out.println(sbf);
    }
}
