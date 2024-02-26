//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle("Red",false,6);
        System.out.println(cr);
        Rectangle rc = new Rectangle("BlUE",true,5,6);
        System.out.println(rc.getArea()+ " "+ rc.getPerimeter());
        System.out.println(rc);
        Square sq = new Square("red",true,5);
        System.out.println(sq.getArea() +" "+sq.getPerimeter());
        System.out.println(sq);
    }
}