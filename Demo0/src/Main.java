//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    private static final String[] DON_VI = {"", "mươi", "trăm"};
    private static final String[] CHUC = {"", "mốt", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();

        String result = convertNumberToWords(number);
        System.out.println("Kết quả: " + result);
        }
    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Không";
        }

        String words = "";
        int unitIndex = 0;

        while (number > 0) {
            int group = number % 1000;
            if (group > 0) {
                String groupWords = convertGroupToWords(group);
                words = groupWords + DON_VI[unitIndex] + " " + words;
            }

            unitIndex++;
            number /= 1000;
        }

        return words.trim();
    }

    private static String convertGroupToWords(int group) {
        String groupWords = "";

        int hundreds = group / 100;
        int tens = group % 100 / 10;
        int ones = group % 10;

        if (hundreds > 0) {
            groupWords += CHUC[hundreds] + " " + DON_VI[2] + " ";
        }

        if (tens > 1) {
            groupWords += CHUC[tens] + " " + DON_VI[1] + " ";
            if (ones > 0) {
                groupWords += CHUC[ones] + " ";
            }
        } else if (tens == 1) {
            groupWords += "mười ";
            if (ones > 0) {
                groupWords += CHUC[ones] + " ";
            }
        } else if (ones > 0) {
            groupWords += CHUC[ones] + " ";
        }

        return groupWords;
    }

    }
