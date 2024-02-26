import sun.awt.geom.AreaOp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = {1,2,3,4,5};
        System.out.println("Ban muon xoa phan tu nao trong mang: ");
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTụ̣̣(mang,soCanXoa);
        if(viTriCanXoa == -1){
            System.out.println("Phan tu khong o trong mang");
        }else {
                mang = xoaMotPhanTu(mang,viTriCanXoa );
        }

        for(int i = 0;i<mang.length;i++){
           System.out.print(mang[i]+ " ");
        }

    }
    static int timViTriPhanTụ̣̣(int[] mang , int phantu){
                int viTri = -1;

                for(int i = 0;i<mang.length;i++){
                        if(mang[i] == phantu){
                            viTri= i;
                        }
                }

                return viTri;
    }
    static int [] xoaMotPhanTu(int [] mang , int viTri){
        int [] mangMoi  = new int[mang.length-1];

        for(int i = 0;i<viTri;i++){
            mangMoi[i] = mang[i];
        }
        for (int i =viTri + 1; i < mang.length; i++){
            mangMoi[i-1] = mang[i];
        }
        return mangMoi;
    }

}
