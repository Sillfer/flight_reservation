package dao;

import metier.entities.admin;

import java.util.List;

public interface IAdminDao {
    public admin save(admin a);

    public List<admin> adminsParMc(String mc);

    public List<admin> showAllAdmin();
    public admin getAdmin(Long id);

    public admin update(admin a);

    public admin deleteAdmin(Long id);
}
