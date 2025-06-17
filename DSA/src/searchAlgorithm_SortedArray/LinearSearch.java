package searchAlgorithm;

public class LinearSearch {

    public static int linearitySearch(int[] num, int target)
    {
          int step = 0;
        for(int i=0;i<num.length;i++){
            step++;
            if(num[i]==target){
                System.out.println("number of steps linearity: "+step);
                return i;
            }
        }
        System.out.println("number of steps linearity: "+step);
        return -1;
    }



}
