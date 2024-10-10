package pratikum1;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC 2
 */
public class latihan2 {
 static final String DB_Url = "jdbc:mysql://1ocalhost:3306/dbunidha3";

    private static Connection Test_konek;
    public static Connection DB_konek() throws SQLException,ClassNotFoundException {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver((java.sql.Driver) myDriver);
            System.out.println("proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung = DriverManager.getConnection(DB_Url, "root", "");
            System.out.println("Koneksi Database Berhasil");
        } catch (final SQLException ex) { System.out.println("koneksi Database Gagal");
        }
      return Test_konek;
      }
}
    
