
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataFetcher {
    public static void fetchData(Connection connection) {
        String query = "SELECT * FROM employees";

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
