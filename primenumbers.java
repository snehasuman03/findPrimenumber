import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        // this is for reading the input file
        File f1 = new File("C:\\Users\\Sneha Suman\\Desktop\\javaPrograms\\primenumber.txt");
        try {
        // this is for writing the text into the output file
            FileWriter fOutput = new FileWriter("C:\\Users\\Sneha Suman\\Desktop\\javaPrograms\\resultPrimenumber.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int myval = Integer.parseInt(val);
                boolean flag = false;
                for (int i = 2; i <= myval / 2; ++i) {
                    if (myval % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    String result = String.valueOf(myval);
                    fOutput.write(result + '\n');
                }
            }
            sc.close();
            fOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
