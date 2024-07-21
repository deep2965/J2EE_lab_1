import java.sql.*;

public class PInsertDemo {
     public static void main (String[] args) {
        Connection conn = null;

        String url = "jdbc:mysql://Localhost: 3306/employee";
        try {
                conn = DriverManager.getConnection(url, "root", "tnrao");

                String sql = "update emp set firstname = ? where lastname = ?";
                PreparedStatement pt = conn. preparestatement (sql);

            pt.setstring(1, "nirav");
            pt.setString(2, "kundra");

            int val = pt.executeUpdate();
            if (val > 0) {

                    System.out.println("updated...");
            }
            pt.close();
            conn.close();
        } catch (Exception e) {

            e. printstackTrace();
        }        
    }
}