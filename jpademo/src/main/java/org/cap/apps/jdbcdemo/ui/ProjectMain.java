package org.cap.apps.jdbcdemo.ui;

import org.cap.apps.jdbcdemo.entities.Employee;

import javax.persistence.*;

/**
 * 1) Get Entity manager factory
 * 2)create entity manager
 * 3)Start transaction
 * 4)Do Operation
 * 5) commit transaction
 * 6)close entity manager
 */
public class ProjectMain {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-ms");


    public static void main(String args[]) {
        ProjectMain project = new ProjectMain();
        project.execute();
    }

    public void execute() {
        Employee employee1 = new Employee("bharat", 200.0);
        Employee employee2 = new Employee("tushar", 200.0);
        System.out.println("objects arte in new/transient state");
        display(employee1);
        display(employee2);

        employee1=save(employee1);
        employee2=save(employee2);

        Integer id1 = employee1.getId();
        Integer id2 = employee2.getId();
        System.out.println("objects are in managed state");
        display(employee1);
        display(employee2);

        System.out.println("objects are in detached state");
        display(employee1);
        display(employee2);

        System.out.println("***employees after fetch**");
        Employee fetched1 = findEmployeeById(id1);
        display(fetched1);
        Employee fetched2 = findEmployeeById(id2);
        display(fetched2);

        employee1.setName("saibharat");
        employee1.setBalance(2000);
        employee1 = update(employee1);
        System.out.println("**after update**");
        display(employee1);

        emf.close();
    }

    public Employee save(Employee employee){
       EntityManager entityManager= emf.createEntityManager();
       EntityTransaction transaction=entityManager.getTransaction();
       transaction.begin();
       entityManager.persist(employee);
       //employee= entityManager.merge(employee);
       transaction.commit();
       entityManager.close();
       return employee;
    }

    public Employee update(Employee employee) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        employee = entityManager.merge(employee);
        transaction.commit();
        entityManager.close();
        return employee;
    }

    public void remove(Employee employee) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(employee);
        transaction.commit();
        entityManager.close();
    }

    public Employee findEmployeeById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    public void display(Employee employee) {
        System.out.println("id=" + employee.getId() + " name=" + employee.getName() + " balance=" + employee.getBalance());
    }

}
