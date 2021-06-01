package playlist.day1Homework3Video5_23;

import java.io.IOException;
import java.io.PrintWriter;

public class Video7DataTypes {
    public static void main(String[] args) throws IOException{
        //tamsayi ifadeler default integer
        PrintWriter out = new PrintWriter("oceans.txt"); // Step 2

        for (int i = 0; i < 65536; ++i ) {
            char c = (char) i;
            out.println("c[" + i + "]=" + c);
        }
        out.close();
        System.out.println("___Video7_son___");
    }
}
