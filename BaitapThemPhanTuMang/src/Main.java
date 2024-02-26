import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                int[] mang = {1,2,3,4,5};
                int[] mang2 = {7,8,9,10,6};
                Scanner sc = new Scanner(System.in);
                int xoCanChen;
                int viTriCanChen = 0;
                System.out.println("Mang ban dau: ");
                for (int i = 0; i < mang.length;i++){
                        System.out.print(mang[i] + "\t");
                }
                System.out.print("\n" +"So can chen: ");
                xoCanChen = sc.nextInt();
                System.out.print("Vi tri can chen:");
                viTriCanChen = sc.nextInt();
                int x = timViTriPhanTụ̣̣(mang,viTriCanChen);
                if(x <= -1 && x >= mang.length){
                    System.out.println("Khong chen duoc phan tu vao mang");
                }else {
                    int[] a =themPhanTuVaoMang(mang,xoCanChen,viTriCanChen);
                    for (int i = 0 ;i < a.length;i++){
                        System.out.print(a[i] + "\t");
                    }
                }
                int[] moi = Gopmang(mang,mang2);
        for (int i = 0; i < moi.length;i++){
            System.out.print(moi[i] + "\t");
        }
        }
    static int[] Gopmang(int[] mang ,int[] mang2){
        int[] mangMoi  = new int[(mang.length + mang2.length)];
        int count = 0;
        for(int i = 0;i < mang.length;i++){
            mangMoi[count] = mang[i];
            count++;
        }
        for (int i = 0; i < mang2.length;i++){
            mangMoi[count] =mang2[i];
            count++;
        }

        return mangMoi;
    }
    static int[] themPhanTuVaoMang(int[] mang ,int soCanChen, int viTri){
        int[] mangMoi  = new int[mang.length + 1];

        for(int i = 0;i < viTri;i++){
            mangMoi[i] = mang[i];
        }
        for (int i =viTri - 1  ; i < mang.length;i++){
            mangMoi[i + 1] = mang[i];
        }
        mangMoi[viTri]=soCanChen;

        return mangMoi;
    }
    static int timViTriPhanTụ̣̣(int[] mang , int viTriCanChen){
        int viTri = -1;

        for(int i = 0 ;i < mang.length ; i++){
            if(mang[i] == viTriCanChen){
                viTri= i +1;
            }
        }

        return viTri;
    }

    }
