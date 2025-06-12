package primeNumber;

public class PrimeNumber {
    public static boolean isItPrimeNumber(int value){
        if(1 >= value){
            return false;
        }
        if(value == 2){
            return true;
        }
        for(int i =2; i<= value/2; i++){
            if(value%i == 0){
                return false;
            }

        }

        return true;
    }

}
