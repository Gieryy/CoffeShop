package POJO;

public class Admin {
    private int idAdmin;
    private String namaAdmin;
    private String username;
    private String password;
    private String loginStatus;

    public Admin(int idAdmin, String namaAdmin, String username, String password, String loginStatus) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
        this.username = username;
        this.password = password;
        this.loginStatus = loginStatus;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
    
    
}
