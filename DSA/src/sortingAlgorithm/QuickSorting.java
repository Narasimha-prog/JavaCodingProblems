package sortingAlgorithm;

public class QuickSorting {

    public static void main(String[] args) {
        int nums[]={4,78,8,2,14,17,45};

        int low=0,high=nums.length-1;

       quickSort(nums,low,high);

        for(int i: nums){
            System.out.print(i+" ");
        }

    }

    private static void quickSort(int[] nums, int low, int high) {
        if(low<high){
         int pi= partition(nums,low,high);

         quickSort(nums,pi+1,high);
         quickSort(nums,low,pi-1);
        }
    }

    private static int partition(int[] nums, int low, int high) {

        int pivot=nums[high];
        int i=low-1;
    for(int j=low;j<high;j++){

        if(nums[j]<pivot){
            i++;
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

    }
        int temp= nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
    }




}
