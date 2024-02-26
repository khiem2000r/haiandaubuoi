import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số Fibonacci cần in : ");
        int n = sc.nextInt();
        System.out.println("Dãy số Fibonacci của " +n+"là: ");
        indayfibonaccị(n);
    }
        static void indayfibonaccị(int num ){
                  int a = 0 ; int b = 1;
                  for (int i = 0 ; i < num ; i++){
                      System.out.println(a + " ");
                      int temp = a + b;
                      a = b;
                      b = temp;
                  }
        }
    }
