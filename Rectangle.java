package rectangle;


public class Rectangle {

    public  double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    public double calculateArea() {
        return length * width;
    }
    
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5,6.2);
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.length + ", Width: " + rect1.width);
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        Rectangle rect2 = new Rectangle(8,3.5);
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.length + ", Width: " + rect2.width);
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        
        
        Rectangle rect3 = new Rectangle(12, 9);
        System.out.println("Rectangle 3:");
        System.out.println("Length: " + rect3.length + ", Width: " + rect3.width);
        System.out.println("Area: " + rect3.calculateArea());
        System.out.println("Perimeter: " + rect3.calculatePerimeter());   
    }
}

