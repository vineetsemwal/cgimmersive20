package org.cap.apps.onetomanynmanytone.ui;

import org.cap.apps.onetomanynmanytone.entities.Department;
import org.cap.apps.onetomanynmanytone.entities.Employee;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1) Get Entity manager factory
 * 2)create entity manager
 * 3)Start transaction
 * 4)Do Operation
 * 5) commit transaction
 * 6)close entity manager
 */
public class ProjectMain {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-ms");

    private EntityManager entityManager;

    public static void main(String args[]) {
        ProjectMain project = new ProjectMain();
        project.execute();
    }

    public void execute() {
        entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Department dev = new Department("dev");
        entityManager.persist(dev);
        int devId = dev.getId();
        Department test = new Department("test");
        entityManager.persist(test);

        Employee employee1 = new Employee("tushar", dev);
        addEmployee(employee1);
        Employee employee2 = new Employee("mahim", dev);
        addEmployee(employee2);

        Employee employee3 = new Employee("shreya", test);
        addEmployee(employee3);
        transaction.commit();

        System.out.println("fetch all employees in department");
        Department fetchedDepartment = entityManager.find(Department.class, devId);
        System.out.println("fetched department=" + fetchedDepartment.getId() + " " + fetchedDepartment.getDeptName());

        List<Employee> employees = fetchedDepartment.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName());
        }

        entityManager.close();

        emf.close();


    }

    public Employee addEmployee(Employee employee) {
        entityManager.persist(employee);
        Department department = employee.getDepartment();
        List<Employee> devEmployees = department.getEmployees();
        if (devEmployees == null) {
            devEmployees = new ArrayList<>();
            department.setEmployees(devEmployees);
        }
        devEmployees.add(employee);
        return employee;
    }


}
