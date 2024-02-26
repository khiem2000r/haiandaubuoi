import java.util.Date;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Xin vui lòng nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Hello: " + name);
        Date now = new Date();
        System.out.println("Thời gian hiện tại: " + now);
        }
    }
