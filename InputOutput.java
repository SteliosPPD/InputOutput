package inputoutput;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InputOutput {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {

        String path = "C:\\Users\\stpap\\Documents\\JavaExamples\\hello.txt.txt";
        File file = new File(path);
        File folder = file.getParentFile();
        System.out.println(folder);
        file.exists();
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }

        PrintWriter writer = new PrintWriter(file, "UTF-8");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();
        System.out.println("Writing finished succesfully");

        //How to append my txt file
//        BufferedWriter x = new BufferedWriter ( new FileWriter(file, true));
//        x.append("This is append line");
//        x.close();

//0-1 file
        FileOutputStream fstream = new FileOutputStream("C:\\Users\\stpap\\Documents\\JavaExamples\\binaryFile.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);
        outputFile.writeInt(10);
        outputFile.close();
    }

}
