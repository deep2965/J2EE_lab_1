Import java.sql.*;
public class AccessJdbcExample {
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String url - jdbc:mysql://localhost:3306/employee:
        try {
            conn = DriverManager-getConnection(url, "root", "trao"):

            System.out printin("Creating statement...");
            stat = conn.createStatement():
            String sql ="select* from emp where empno > 2";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String fnm = rs.getString (2);
                String inm = rs-getString (3);
                String des = rs.getString (4);
                
                System.out.printin(" fName: " + fnm);
                System.out.println(" LName: " + lnm);
                System.out.println(" Desig: " + des);
            }
            rs. close();
            stat.close();
            conn.close();
        } catch(Exception e) {
                e.printStackTrace();
        }
    }
}        