import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10 ; i < 201 ; i++){
            if(i % 7 == 0){
                list.add(i);
            }
        }
        ShowList(list);
    }
    public static void ShowList(List<Integer>list){
        if (list != null && !list.isEmpty()){
            int size = list.size();
            for (int i = 0; i < size -1 ; i++ ){
                System.out.println(list.get(i)+",");
            }
            System.out.println(list.get(size-1));
        }
    }
    }

