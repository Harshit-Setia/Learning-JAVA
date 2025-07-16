import java.util.Scanner;
// Custom exception class for invalid input
class InvalidInput extends Exception {
    public InvalidInput(String msg) {
        super(msg);
    }
}

public class ExceptionClass {
    public static void positiveNum(int num) throws InvalidInput { // tell this method may throw exception
        if (num < 0) {
            // Throw custom exception if number is negative
            throw new InvalidInput("Number should be greater than zero");
        }
    }
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) { // after completing try block scanner will be closed automatically
            String x = sc.next();
            int num = Integer.parseInt(x); // Try to convert input to integer
            positiveNum(num);
            System.out.println(num); // Print the valid number
        }
        // Handle case where input is not a valid integer
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        // Handle custom invalid input exception
        catch (InvalidInput e) {
            System.out.println(e.getMessage());
        }
        // Handle all general exceptions
        catch (Exception e) {
            System.out.println(e);
        }
        finally { // always executes
            System.out.println("Done");
        }
    }
}
