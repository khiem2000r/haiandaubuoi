import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số dòng của mảng là: ");
        int dong = sc.nextInt();
        System.out.print("Số cột của mảng là: ");
        int cot = sc.nextInt();
        sc.nextLine();

        String[][] mang = new String[dong][cot];

        for (int i = 0 ;i < dong; i++){
            for (int j = 0; j < cot; j++){
                    System.out.print("Mang["+i+"]["+j+"]");
                    mang[i][j] = sc.nextLine();
            }
        }
        for (int i = 0;i<mang.length;i++){
            for (int j = 0; j <mang[i].length;j++){
                System.out.print(mang[i][j] + " ");
            }
            System.out.println();
        }
        String a = "Khiem";
        System.out.print("So lan khiem xuat hien: " + demKyTu(mang,a));
    }
    static int demKyTu(String[][] mang,String Chuoi ){
            int count = 0;
            for(int i = 0; i < mang.length;i++){
                for (int j = 0; j < mang[i].length;j++){
                    if (mang[i][j].equals(Chuoi)){
                        count++;
                    }
                }
            }
        return count;
    }

}
