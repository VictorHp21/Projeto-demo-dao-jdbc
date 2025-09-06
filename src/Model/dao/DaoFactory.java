package Model.dao;

import Model.dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return  new SellerDaoJDBC(DB.getConnection());
    }
}
