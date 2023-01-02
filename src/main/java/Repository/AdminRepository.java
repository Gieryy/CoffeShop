package Repository;

public interface AdminRepository <T, ID>  {
     T login(String username, String password);
}
