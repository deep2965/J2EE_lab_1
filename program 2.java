Import java.sql.*;

public class AccessJdbcExample 
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String url = "jabc:mysql://localhost: 3306/employee";
        try {
            // Register JDBC driver
            // Class. forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection(url, "root", "tnrao");

            // Execute a query
            System.out-printin("Creating statenent...");
            stat = conn.createStatement();
            String sql = "SELECT * FROM emp";
            ResultSet rs = stmt.executeQuery (sql);

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String fnm = rs-getString (2);
                String Inm = rs-getString (3);
                String des = rs.getString (4);

                // Display values
                System.out.printin(" fName: " + fnm);
                System.out.printin(" LName: " + lnm);
                System.out.printin(" Desig: " + des);
            }
            rs. close();
            stmt.close();
            conn. close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }