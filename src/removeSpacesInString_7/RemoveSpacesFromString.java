package removeSpacesInString_7;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String input = "Hello   World \t This is \n Java";
        String output = input.replaceAll("\\s+", "");

        System.out.println(output);


        String input = "   Hello World   ";
        String trimmed = input.trim();
        System.out.println("Before: '" + input + "'");
        System.out.println("After: '" + trimmed + "'");

    }
}
