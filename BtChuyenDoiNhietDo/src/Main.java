import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double F ;
        double C ;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    F = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + FtoC(F));
                    break;
                case 2 :
                    System.out.println("Enter v: ");
                    C = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + CtoF(C));
                    break;
                case 0 : System.exit(0);


            }
        }while (choice != 0);
            
        }
    public static double CtoF(double celsius){
        double F =  (9.0 / 5) * celsius + 32;
        return F;
    }
    public static double FtoC(double fahrenheit){
        double C = (5.0 / 9) * (fahrenheit - 32);
        return C;
    }
    }
