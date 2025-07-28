package opps_concept;

abstract class Shape {
    abstract void draw();  

    void display() {      
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();   
        s1.draw();                  
        s1.display();              

        Shape s2 = new Rectangle(); 
        s2.draw();                  
        s2.display();               
    }
}
