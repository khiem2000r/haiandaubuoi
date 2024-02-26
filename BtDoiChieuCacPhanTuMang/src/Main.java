
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        System.out.println("Nhap So Luong Phan Tu Mang : ");
        int n = Nhap.nextInt();
        int giatri ;
        int[] Mang = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu mang");
        for (int i =0;i<n ;i++){
            System.out.println("Phan tu thu "+(i + 1)+" la: ");
            //Nhap du lieu vao mang
            Mang[i] = Nhap.nextInt();
        }
        System.out.println("Ban muon tim gia tri nao trong mang: ");
        giatri = Nhap.nextInt();
        int timdc =TimGiatrị̣(Mang, giatri);
        if (timdc !=-1){
            System.out.println("Gia tri "+giatri+" tai vi tri " +timdc);
        }else {
            System.out.println("Gia tri "+giatri+"Khong co trong mang " );
        }
        int sl = Demsokhoang5den10(Mang);
        System.out.println("So luong phan tu tu 5 den 10 la: " + sl);
        inMang(Mang);
       // System.out.println("Gia tri nho nhat trong mang: " + timgiatrilonnhatrtongmang(Mang));

            //int[] Mang = {1,2,3,4,5};
           // System.out.println("Mảng ban đầu: ");
           //inMang(Mang);
          //  DaoChieuMang(Mang);
        //  System.out.println("\n"+"Sau khi đảo chiều: ");
      //  inMang(Mang);
        }
        static void DaoChieuMang(int Mang[]){
            int Star = 0;
            int end = Mang.length -1;
            for (Star = 0 ;Star < end;Star++){
                int templ = Mang[Star];
                Mang[Star] = Mang[end];
                Mang[end] = templ;
                end--;
            }
        }
       public static int  timgiatrilonnhatrtongmang(int Mang[]){
                    int i = 0;
                    int GTNN = Mang[0];
                    int end = Mang.length;
            for (i = 0 ;i < end;i++){
                if (GTNN > Mang[i])
                {
                    GTNN = Mang[i];
                }

            }return GTNN;
        }
       public static int TimGiatrị̣(int Mang[],int i){
                    for (int a = 0 ; a <Mang.length;a++){
                        if (i == Mang[a]){
                            return a;
                        }
                    }
            return -1;
        }
        static void inMang(int Mang[]){

            for (int i = 0;i < Mang.length ;i++){
                System.out.print(Mang[i]+ " "+"\n");
            }

        }
         public static int Demsokhoang5den10(int mang[]){
                    int count =0;
                    for (int i =0 ;i < mang.length;i++){
                        if (mang[i] >= 5 && mang[i] <= 10){
                            count++;
                        }
                    }

        return count;
         }

    }
