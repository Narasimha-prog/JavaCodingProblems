package linearitySearch;

import java.sql.Array;

public class LinearSearch {



    public static void main(String[] args) {
        //int[] num= {5,7,12,34,56,78};
        int [] num= new int[1000];

        int target=900;


        int result2=linearitySearch(num,target);
        int result=binarySearch(num,target);
        if(result != -1){
            System.out.println("Element Having index is : "+ result);
        }else{
            System.out.println("Element not there  ");
        }

    }

    private static int linearitySearch(int[] num, int target)
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

    private static int binarySearch(int[] num, int target)
    {
        //5,7,12, 34 ,56,78
        int step = 0,left=0;
        int right=num.length-1;


            while (left<=right){
                //in future right also has a number to search
              
                step++;
                int mid=(left+right)/2;
                if(num[mid]==target){
                    System.out.println("number of steps: "+step);
                    return mid;
                } else if (num[mid] > target) {
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        System.out.println("number of steps: "+step);

        return -1;
    }



}
