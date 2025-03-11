abstract class Shape{
  abstract void draw();

}

class Circle extends Shape{
void draw(){
    System.out.println("Draw Circle");
}

}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw Rectangle");
    }

}


class Square extends Shape{
    void draw(){
        System.out.println("Draw Square");
    }

}

class AbstractDemo{
public static void main(String[] args) {
    

Shape s1 = new Circle();
s1.draw();

Shape s2 = new Rectangle();
s2.draw();

Shape s3 = new Square();
s3.draw();
}
}
