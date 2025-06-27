package sortingAlgorithm;

public class InsertionSorting {
    public static void main(String[] args) {

        int nums[]={4,78,8,2,14,17,45};

        int size=nums.length;
        System.out.println("UnSorted Array: ");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i=1;i<size;i++){
           int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }



        System.out.println();
        System.out.println("Sorted Array: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
