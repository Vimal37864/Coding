import java.sql.*;

public class CallStatement {

    public static void main(String args[]) {

        try {

            String url = "jdbc:mysql://localhost:3306/pavi";
            String username = "root";
            String password = "Pavi@2003";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn =
                    DriverManager.getConnection(url, username, password);

            CallableStatement cs =
                    conn.prepareCall("{call getStudent()}");

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getInt(3)
                );
            }

            rs.close();
            cs.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}