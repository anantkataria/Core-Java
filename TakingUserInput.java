import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingUserInput {
    // using throws statement on main method is not a good practice for production environment,
    // as these errors get passed directly to compiler, which is obviously not going to handle them and, 
    // simply stop the execution further
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        // mentioning System.in tells the class that we are taking input from the console or terminal
        InputStreamReader in = new InputStreamReader(System.in);

        // BufferedReader can read not only from the intput terminal, but also files and many other things
        // you have to specify from where to read using a Reader class object,
        // for example, since we want to read it from the terminal input, we are providing it an InputStreamReader instance, which is a subclass of Reader class
        BufferedReader bf = new BufferedReader(in);
        
        int num = 0;

        try {
            // bf.readLine() method returns a string, so we need to convert it into an interger
            num = Integer.parseInt(bf.readLine());
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("You entered : " + num);
        

        // There is another and less painful way to read the input
        // Using Scanner
        System.out.println("Enter a number again: ");
        Scanner sc = new Scanner(System.in);
        
        // unlike buffer readers nextline() method, which always returns string, 
        // scanner has many different methods for taking different types of inputs
        // to take an integer input, use nextInt() method
        num = sc.nextInt();
        System.out.println("You entered : " + num + ", which was scanned through a scanner!");

        // it is a good practice to close a BufferedReader and/or Scanner once it has been used
        // when we surround input logic in the try block, these closing statements should come under finally block
        bf.close();
        sc.close();

    }
}
