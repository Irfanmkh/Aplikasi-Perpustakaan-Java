/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

/**
 *
 * @author Administrator
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static String query;
    public static ResultSet result;
     public static void koneksikan() throws SQLException{
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pinjam_buku?useTimezone=true&serverTimezone=UTC", 
                 "root", "");
        stm= con.createStatement();
    }
    public static void CRUD() throws SQLException{
        koneksikan();
        stm.executeUpdate(query);
    }
    public static void get() throws SQLException{
        koneksikan();
        result = stm.executeQuery(query);
    }
    public static Connection getkoneksi() {
       if (con == null){
           try {
            String url ="jdbc:mysql://localhost:3306/pinjam_buku?useTimezone=true&serverTimezone=UTC";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
           }catch (Exception e) {
            System.out.println("koneksi gagal" +e.getMessage());
        }
    }
        return con;
}
}

        

    

