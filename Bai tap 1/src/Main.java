import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            final int VND = 24380;
            int USD;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Bạn muốn đổi bao nhiêu USD sang VND = ");
        USD = scanner.nextInt();

        System.out.print( "Số tiền bạn muốn đổi sang VND là : " + USD * VND + " Dong");
        }
    }
