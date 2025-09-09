package application;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Department;
import Model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


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

        Seller newSeller = new Seller(null, "Victor", "victorhenrique@gmail.com", java.sql.Date.valueOf("2001-05-21"), 9000.0, department);

        sellerDao.insert(newSeller);

        System.out.println("Inserted! new id = " + newSeller.getId());

        System.out.println("\n=== TESTE 5: Seller Update() ===");

        seller = sellerDao.findById(1);
        seller.setName("Bruce Wayne");

        sellerDao.update(seller);
        System.out.println("Update completed!");


        System.out.println("\n=== TESTE 6: Seller delete() ===");

        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();

        sellerDao.deleteById(id);

        System.out.println("Delete completed!");


        sc.close();







    }
}
