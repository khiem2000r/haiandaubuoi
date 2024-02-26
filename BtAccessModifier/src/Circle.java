public class Circle {
    private  double radius = 1;
    private  String color = "red";
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    private double getRadius(){
        return radius;
    }
    private double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Radius: "+ getRadius() + " Area: "+getArea() + " Color: " +color;
    }
}
