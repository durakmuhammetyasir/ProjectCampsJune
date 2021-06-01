package playlist.day1Homework3Video5_23;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class Video17StringsWriteToFile {
    public static void main(String[] args) {
        String destFile = "primitives.dat";
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(destFile))) {
           // Write some primitive values and a string
            dos.writeInt(76543);
            dos.writeDouble(6789.50);
            dos.writeBoolean(true);
            dos.writeUTF("Java Input/Output is cool!");
            // Flush the written data to the file
            dos.flush();
            System.out.println("Data has been written to "
                    + (new File(destFile)).getAbsolutePath());
        } catch (FileNotFoundException e) {
            FileUtil.printFileNotFoundMsg(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    private static class FileUtil {
        public static void printFileNotFoundMsg(String destFile) {
        }
    }
}