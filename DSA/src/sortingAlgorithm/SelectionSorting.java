package sortingAlgorithm;

public class SelectionSorting {
    public static void main(String[] args) {

        int nums[]={4,78,8,2,14,17,45};
        //                       j  j+1    so j ends in j at size-1
        // last value is higher and least value is at first ,so sorted in every iteration
        int size=nums.length;
        int temp=0,minIndex=-1;
        System.out.println("UnSorted Array: ");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                  if(nums[minIndex] > nums[j]){
                          minIndex=j;
                  }
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
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
