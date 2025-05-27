public class Factorial_Fibonacci {

    public static int factorial(int n) {
    	
        if (!(n == 1 || n==0)) {
        	
            return n * factorial(n - 1);
        } else {
            return 1;}}

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);}}
    
    public static void main(String[] args) {
        int number1 = 5; 
        int number2 = 8;
        
        System.out.println("Factorial of " + number1 + " is: " + factorial(number1));
        
        System.out.print("Fibonacci series " + number2 + " is : ");
            for (int i = 0; i <= number2; i++) {
            System.out.print(fibonacci(i) + " ");}
        }}

