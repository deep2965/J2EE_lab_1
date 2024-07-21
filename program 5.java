import java.sql.*;

public class PDeleteDemo {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url = "jdbc:mysql://localhost: 3306/employee";

        try {
            conn = DriverManager.getConnection(url, "root", "tnrao");

            System.out println("Creating prepared statement...");
            String sql= "DELETE FROM emp WHERE firstname = ?";
            pstmt = conn.preparestatement(sql);

            pstmt.setString(1, "kashayap");

            int val = pstmt.executeupdate();

            System.out.println(val + " record(s) deleted successfully");

            pstmt.close();
            conn. close():
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}