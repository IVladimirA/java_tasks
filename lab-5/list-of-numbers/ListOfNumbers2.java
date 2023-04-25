import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class ListOfNumbers2 {
    
    private ArrayList<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            arr.add(new Integer(i));
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
        
            for (int i = 0; i < arr.size(); i++)
                out.println("Value at: " + i + " = " + arr.get(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public void readList() {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("input.txt"));
            int n = Integer.parseInt(in.readLine());
            arr = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(in.readLine());
                arr.add(a);
                System.out.println(a);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            try {
                if (in != null)
                    in.close();
                } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ListOfNumbers2 myList = new ListOfNumbers2();
        myList.readList();
    }
}

