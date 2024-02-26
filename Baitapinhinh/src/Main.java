import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Nhap chieu rong va chieu dai cua hinh ve
        //System.out.println("Chieu dai cua hinh ");
        //int chieucao = sc.nextInt();
        //System.out.println("Chieu rong cua hinh");
        //int chieurong = sc.nextInt();
        System.out.println("Hinh chu nhat");
        for (int i = 1 ; i <= 3 ;i++ ){
            for (int j =0 ; j <= 10 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hinh tam giac vuong");
        System.out.println("Hinh 1");
        for (int i = 1 ; i < 12 ;i++ ){
            for (int j =0 ; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hinh 2");
        for (int i = 7 ; i >= 1;i--){
            for (int j = 1 ; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hinh Tam giac can ");
        for (int i = 1 ; i < 10 ;i++ ){
            for (int j =0 ; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 10 ; i >= 1;i--){
            for (int j = 1 ; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
