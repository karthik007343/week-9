import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        // Checked Exceptions
        try {
            // FileNotFoundException
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception rasied.");
            //e.printStackTrace();
        }

        try {
            // ClassNotFoundException
            Class.forName("NonExistingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exception raised.");
            //e.printStackTrace();
        }

        try {
            // IOException
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException occurred.");
            //e.printStackTrace();
        }

        // Unchecked Exceptions
        try {
            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            int num = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
           // e.printStackTrace();
        }

        try {
            // NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");
           // e.printStackTrace();
        }

        try {
            // ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
           // e.printStackTrace();
        }
    }
}
