package dao.adminDao;

import metier.entities.admin;

import java.util.List;

public interface IAdminDao {
    public admin save(admin a);

    public List<admin> adminsParMc(String mc);

    public admin loginAdmin(String email,String passWord);
    public admin getAdmin(Long id);

    public admin update(admin a);

    public admin deleteAdmin(Long id);
}
