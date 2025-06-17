package checkVowelsPresentInString;

public class CheckVowelspresentInString {
    public static boolean checkWetherVowelsisPresentInString(String value){

       return value.toLowerCase().matches(".*[aeiou]*.");
    }
}
