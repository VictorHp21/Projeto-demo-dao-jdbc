package application;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: Seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TESTE 2: Seller findByDepartment ===");
        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: Seller findAll() ===");


        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 4: Seller Insert() ===");

        Seller newSeller = new Seller(null, "Pedro", "pedro@gmail.com", java.sql.Date.valueOf("2023-01-01"), 4000.0, department);

        sellerDao.insert(newSeller);

        System.out.println("Inserted! new id = " + newSeller.getId());








    }
}
