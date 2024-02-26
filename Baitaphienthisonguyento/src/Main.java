import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số để kiểm tra: ");
        int snt = sc.nextInt();
        int count = 0;
        for (count = 0 ; count <= snt;count++){
            if (kiemTraSoNguyenTo(count)){
            System.out.print(count + " ");
            }
            //Hiển thị các số nguyên tố nhỏ hơn 100
            //if (count >= 100){
           //     return;
           // }
        }
    }
    public static boolean kiemTraSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}