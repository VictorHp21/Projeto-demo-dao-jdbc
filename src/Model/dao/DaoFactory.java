package Model.dao;

import Model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return  new SellerDaoJDBC();
    }
}
