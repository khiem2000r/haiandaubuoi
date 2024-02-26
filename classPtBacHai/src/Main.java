import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.geDiscriminant();
        double[] roots = quadraticEquation.root();
        if (delta <0 ){
            System.out.println("Phuong trinh vo nghiem");
        }else {
            System.out.println("Nghiem cua phuong trinh: ");
             for (double root : roots){
            System.out.println(root);
        }
        }
    }
}