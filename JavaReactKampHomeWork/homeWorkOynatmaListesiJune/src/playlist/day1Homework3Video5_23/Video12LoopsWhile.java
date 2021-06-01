package playlist.day1Homework3Video5_23;


import java.sql.*;
public class Video12LoopsWhile {
    public static final int MAX_TRIES = 10;
    public static void main(String... args) throws Exception {
        int cntTries = 0;
        Connection con = null;
        while (con == null && cntTries < MAX_TRIES) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sample", "root", "pass");
            } catch (Exception e) {
                ++cntTries;
                System.out.println("Connection refused. Retrying in 5 seconds ...");
                Thread.sleep(5000);
            }
        }
        if (con != null) {
            // con != null, do something
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            con.close();
        } else {
            System.out.println("Could not connect!");
        }
    }
}