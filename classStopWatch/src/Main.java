import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new  int[100000];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt();
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " milliseconds");

    }
    public static  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length;j++){
                    if(arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
                if(minIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }

    }

}