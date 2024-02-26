import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu dong: " +"\n");
        int dong = sc.nextInt();
        System.out.print("Ban muon nhap bao nhieu cot: ");
        int cot = sc.nextInt();
        int[][] mang = new int[dong][cot];

        for (int i = 0; i < dong;i++){

            for (int j = 0; j < cot;j++)
            {
                System.out.print("Mang ["+ i+"]["+j+"]" );
                mang[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < mang.length;i++){

            for (int j = 0; j < mang[i].length;j++){
                System.out.print(mang[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Phan tu nho nhat: " + timViTriNhoNhat(mang));
        System.out.print("Tong cong so 2 la: " + tongCuaCotXacDinh(mang,2));
    }

    static int timViTriNhoNhat(int[][] mang){
        int vitrinhonhat = mang[0][0];
        for (int i = 0; i < mang.length;i++) {

            for (int j = 0; j < mang[i].length; j++) {
                if (vitrinhonhat >= mang[i][j] )
                {
                    vitrinhonhat = mang[i][j];
                }
            }
        }
        return vitrinhonhat;
    }
    static int tongCuaCotXacDinh(int[][] mang , int cotSo){
        int tong = 0;
        for (int i = 0; i < mang.length;i++) {
            if(cotSo >= 0 && cotSo < mang[i].length) {
                tong += mang[i][cotSo];
            }else {
                System.out.print("Cot Khong Hop Le");
            }

        }

        return tong;
    }
    }
