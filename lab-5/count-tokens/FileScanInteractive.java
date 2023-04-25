import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        return instanceCount;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(-1);
        }
        String filePath = args[0];
        FileScanInteractive myScanner = new FileScanInteractive();
        Scanner cin = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter the search string or q to exit: ");
            String s = cin.nextLine().trim();
            if (s.equalsIgnoreCase("q")) {
                break;
            }
            try {
                System.out.println("The word \"" + s + "\" appears in file: " + myScanner.countTokens(filePath, s));
            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
        cin.close();
    }
}