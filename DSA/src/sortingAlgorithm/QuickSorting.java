package sortingAlgorithm;

public class QuickSorting {

    public static void main(String[] args) {
        int nums[]={4,78,8,2,14,17,45};

        int low=0,high=nums.length-1;

       quickSort(nums,low,high);
    }

    private static void quickSort(int[] nums, int low, int high) {
        if(low<high){
         int pi= partition(nums,low,high);

        }
    }

    private static int partition(int[] nums, int low, int high) {

        return low;
    }
}
