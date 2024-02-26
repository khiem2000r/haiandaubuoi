//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle cl = new Circle();
        System.out.println(cl);
        Circle cl1= new Circle(5.0,"Green");
        System.out.println("*******************");
        System.out.println(cl1 +" "+ cl1.getArea());
        Cylinder cylinder = new Cylinder(5,"Non",3);
        System.out.println("*******************");
        System.out.println(cylinder+ " "+cylinder.getVolume());

     }
}