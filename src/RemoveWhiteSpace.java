public class RemoveWhiteSpace {
    String input = "Hello   World \t This is \n Java";
    String output = input.replaceAll("\\s+", "");
}
