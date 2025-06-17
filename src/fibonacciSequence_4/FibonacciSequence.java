package fibonacciSequence;

public class FibonacciSequence {

    public static void printFibonacciSequence(int value){
        int a=0;
        int b=1;
        int c=1;

        for(int i=1;i<=value;i++){
            System.out.print(a+" ,");
            a=b;
            b=c;
            c=a+b;

        }
    }
}
