package searchAlgorithm_SortedArray;

public class BinarySerach {
    public static int binarySearch(int[] num, int target)
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
