//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point2D p = new Point2D(4,5);
        System.out.println(p);
        float[] ma = p.getXY();
        for(float m : ma){
            System.out.println(m);
        }
        Point3D p3 = new Point3D(5,4,6);
        float[] mp3 = p3.getXYZ();
        for (float m : mp3){
            System.out.println(m);
        }
    }
}