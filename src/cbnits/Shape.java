package cbnits;

public class Shape {
    void draw()
    {
        System.out.println("Can't say shape type");
    }
}
class Square extends Shape{
    @Override
    void draw()
    {
        super.draw();
        System.out.println("Square shape");
    }
}
class Result{
    public static void main(String[] args) {
        Shape r=new Square();
        r.draw();
    }
}
