package L4_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Booking {
    private static final String URL = "jdbc:mysql://localhost:3306/train_db";
    private static final String USER = "root"; // change if different
    private static final String PASSWORD = "Geetha$123"; // your MySQL password

    public void savePassenger(Passenger p) {
        String sql = "INSERT INTO passengers (id, name, pref_berth, allocated_berth, booking_date) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getName());
            stmt.setString(3, p.getPrefBerth().name());
            stmt.setString(4, p.getAllocatedBerth().name());
            stmt.setDate(5, java.sql.Date.valueOf(p.getBkdDate()));

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Passenger saved successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
