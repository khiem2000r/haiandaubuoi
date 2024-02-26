import jdk.internal.dynalink.beans.StaticClass;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Số bạn muốn chuyển qua chữ : ");
        int a =sc.nextInt();
        String s = Integer.toString(a);
        numberToWords(s.toCharArray());
    }
        static void numberToWords(char num[]){
            int len = num.length;
            if(len ==0){
                System.out.print("Chuoi rong");
            }
            if(len >=4) {
                System.out.print("Duoi 4 con so");
            }
            String [] onedigit = {"Zero","one","two","three","four","five","six","seven","eight","nice"};
            String [] twodigits ={"","Ten","Eleven","twelve","thirten","fourteen","fifteen","sixteen","seventeen","eighteen","niceteen"};
            String [] multipleoften = {"","","Twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
            String [] poweroftens = {"Hundred"};
            System.out.print(String.valueOf(num) + ":");
            if(len ==1 ){
                  System.out.println(onedigit[num[0]-'0']);
                return;
            }
            int x = 0;
            while (x<num.length){
                if(len >= 3) {
                    if (num[x] - '0' != 0) {
                        System.out.print(onedigit[num[x] - '0']);
                        System.out.print(poweroftens[len - 3] + "");
                    }
                    --len;
                }else {
                    if(num[x]-'0' == 1){
                      int sum = num[x] - '0' + num[x + 1] -'0';
                      System.out.print(twodigits[sum]);
                      return;
                    }else if(num[x]-'0' == 2 && num[x+1]-'0'==0){
                        System.out.print("Twenty");
                        return;
                    }else {
                        int i = (num[x]-'0');
                        if (i >0){
                            System.out.print(multipleoften[i]+ " ");
                        }else System.out.print("");
                        ++x;
                        if (num[x] - '0' != 0)
                        System.out.println(onedigit[num[x] - '0']);
                    }
                }
                ++x;
            }
    }
}
