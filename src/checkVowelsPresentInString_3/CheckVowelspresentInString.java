package checkVowelsPresentInString_3;
import java.util.regex.*;
public class CheckVowelspresentInString {
    public static boolean checkWetherVowelsisPresentInString(String value1){

      // return value.toLowerCase().matches(".*[aeiou]*.");

       // String before="ahsgduayhbas";

        Pattern pattern=Pattern.compile("[aeiouAEIOU]");
        Matcher matcher=pattern.matcher(value1);
        boolean  value=false;
        while(matcher.find()){
            System.out.println(matcher.group()+" ");
            value=true;
        }
        System.out.println(value1);


return value;

    }

    public static void main(String[] args) {
        System.out.println(CheckVowelspresentInString.checkWetherVowelsisPresentInString("jhguyfyf"));
    }
}
