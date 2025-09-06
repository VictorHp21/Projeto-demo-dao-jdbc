package application;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {



        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);



        System.out.println(seller);

    }
}
