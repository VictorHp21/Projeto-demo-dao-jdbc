package application;

import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import Model.entities.Department;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TESTE 1: Department findById ===");

        Department dep = departmentDao.findById(1);

        System.out.println(dep);

        System.out.println("\n=== TESTE 2: Department findAll() ===");

        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: Department Insert() ===");

        Department newDep = new Department(null, "RH");

        departmentDao.insert(newDep);
        System.out.println("Inserted! new id = " + newDep.getId());


        System.out.println("\n=== TESTE 4: Department Update() ===");

        dep = departmentDao.findById(9);
        dep.setName("Sales");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("\n=== TESTE 5: Department Delete() ===");

        departmentDao.deleteById(10);
        System.out.println("Delete completed!");

    }
}
