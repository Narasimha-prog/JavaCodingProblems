package sortingAlgorithm;

public class BubbleSorting {
    public static void main(String[] args) {

        int nums[]={4,78,8,2,14,17,45};
        //                       j  j+1    so j ends in j at size-1
        // last value is higher and least value is at first ,so sorted in every iteration
        int size=nums.length;
        int temp=0;
        System.out.println("UnSorted Array: ");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j]>nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                }
            }
            System.out.println();
            for(int num: nums){
                System.out.print(num+" ");
            }
        }

        System.out.println();
        System.out.println("Sorted Array: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
