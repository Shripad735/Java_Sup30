public class overloading {
    //overload area to calculate area of circle/rectangle
    static public float area(float radius) {
        return (3.14f * radius * radius);
    }
    static public float area(float length, float breadth) {
        return (length * breadth);
    }
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + area(5.0f));
        System.out.println("Area of Rectangle: " + area(5.0f, 6.0f));
    }
    
}
