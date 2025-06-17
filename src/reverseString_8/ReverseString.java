package reverseString;

public class ReverseString {
    public static String reverseStringValue(String value){
        char[] charArray=value.toCharArray();

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=charArray.length-1;i>=0;i--){
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }
}
