//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        point.move().move(); // Di chuyển ba lần liên tiếp
        System.out.println("New coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}