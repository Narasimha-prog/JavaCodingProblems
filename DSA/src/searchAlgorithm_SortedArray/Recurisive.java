package searchAlgorithm;

public class Recurisive {

    public static int recursiveFuntion(int[] num,int target,int left,int right){
        //3,5,6,7,9
        if(left<=right){
            int mid=(left+right)/2;
            if(num[mid]==target){
                return mid;
            } else if (num[mid]<target) {
                left=mid+1;
            return    recursiveFuntion(num,target,left,right);

            }
            else {
                right=mid-1;
             return   recursiveFuntion(num,target,left,right);
            }
        }
        return -1;
    }


}
