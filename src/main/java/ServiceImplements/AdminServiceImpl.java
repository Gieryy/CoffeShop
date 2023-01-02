package ServiceImplements;

import POJO.Admin;
import Service.AdminService;
import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminServiceImpl implements AdminService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
       public Admin login(String username, String password) {
        Admin admin = null;
        String sql = "SELECT ad.id, ad.nama_depan, ad.nama_belakang, "
                + "ak.id_akun, ak.email, ak.username, ak.level "
                + "FROM admin ad, akun ak "
                + "WHERE ad.id_akun = ak.id_akun "
                + "AND ak.username = '"+username+"' "
                + "AND ak.password = '"+password+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                admin = new Admin();
                admin.setidAdmin(rs.getInt("id"));
                admin.setNama(rs.getString("nama_depan"));
                akun = new Akun();
                akun.setId(rs.getInt("id_akun"));
                akun.setEmail(rs.getString("email"));
                akun.setUsername(rs.getString("username"));
                akun.setLevel(rs.getString("level"));
                admin.setAkun(akun);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return admin;
    }
    
}
 
