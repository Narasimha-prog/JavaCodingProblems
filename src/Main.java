import checkOddNumbers.CheckOddNumbers;
import fibonacciSequence.FibonacciSequence;
import oddOReven.OddOrEven;
import primeNumber.PrimeNumber;
import reverseString.ReverseString;
import swapTwoNumbers.SwapTwoNumbers;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         // System.out.println(OddOrEven.isItEvenOrOdd(13343));
        //System.out.println(PrimeNumber.isItPrimeNumber(2));
        //System.out.println(ReverseString.reverseStringValue("Mani"));
        //SwapTwoNumbers.swapTwoNumbersValue(12,32);
        //FibonacciSequence.printFibonacciSequence(89);
        CheckOddNumbers.printOddNumbers(List.of(12,45,5,5));
    }
}