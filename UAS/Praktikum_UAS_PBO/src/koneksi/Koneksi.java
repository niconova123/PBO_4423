package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
public class Koneksi {
	
	public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sewabuku", "root", ""); // uri, username, password
            return connection;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Terkoneksi dengan database, periksan konfigurasi database pada src/database/RentDatabase.java");
            return null;
        }
    }
}

