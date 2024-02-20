class AnantException extends RuntimeException {
    public AnantException(String string) {
        super(string);
    }
}

// below in the main method, we understand the use of 'throw' keyword
// there is another keyword called 'throws'
// this statement is used when given class does not implement try-catch logic in itself,
// and passes the error to its super class
// When we use 'throws <Some Error>' on the main method, we are simply passing the error,
// to the compiler, which will definitely not handle it and stop the execution at the line of error
// so its not a good practice to use 'throws' for main() method.

public class ExceptionHandling {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int i=5; 
        int j=0;

        @SuppressWarnings("unused")
        int nums[] = new int[5];
        @SuppressWarnings("unused")
        String str = null;

        try {
            // j = 18/i;
            // System.out.println(str.length());
            // System.out.println(nums[5]);

            // you can also make your own custom error and throw it using 'throw' statement
            // note: you can also throw inbuilt exceptions using throw statement as well
            if(j == 0) {
                throw new AnantException("I don't want to print zero");
            }
        }
        catch(AnantException e) {
            System.out.println("custom made error: " + e);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Accessing index outside the array length");
        }
        // this is a parent class for many types of exception
        // so it will handle all errors
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            // this finally block is used to run code that must be executed after try catch block
            // for example closing of some resources that you might use during try-catch block
        }
        // System.out.println(j);
        System.out.println("bye");
    }
}
