package swapTwoNumbers_9;

public class SwapTwoNumbers {

    public static  void swapTwoNumbersValue(int value1,int value2){

        System.out.println("value 1 :"+value1+"   :     "+"value 2 :"+value2);

        value1=value2+value1;
        value2=value1-value2;
        value1=value1-value2;


        System.out.println("value 1 :"+value1+"   :     "+"value 2 :"+value2);

    }
}
