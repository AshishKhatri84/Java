import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Bridge {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String odbcUrl = "jdbc:odbc:SampleDB";
            Connection connection = DriverManager.getConnection(odbcUrl);
            Statement statement = connection.createStatement();
            String query = "SELECT ID, Name FROM Employee";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }}}