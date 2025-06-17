package checkOddNumbers_1;

import java.util.List;

public class CheckOddNumbers {

    public static void printOddNumbers(List<Integer> values){
        for(int i: values){
            if(i%2==0){
                System.out.println(false);
            }
            else {
                System.out.println(true);
            }

        }
    }
}
