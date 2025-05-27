import java.util.function.Function;
public class GenericFunctionalInterfaceExample {
    public static void main(String[] args) {
       
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;   }
            return result; };

        int number = 6;
        System.out.println("Factorial of " + number + " is: " + factorial.apply(number));

        // String reversal
        Function<String, String> reverseString = (str) -> {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));}
            return reversed.toString();  };

        String inputString = "Lina";
        System.out.println("Reversed string: " + reverseString.apply(inputString));}}
