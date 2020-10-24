package org.cap.apps.onetomanynmanytone.ui;

import org.cap.apps.onetomanynmanytone.entities.Order;
import org.cap.apps.onetomanynmanytone.entities.Product;

import javax.persistence.*;
import java.util.*;

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

        Product product1=new Product();
        entityManager.persist(product1);
        Product product2=new Product();
        entityManager.persist(product2);

        Order order=new Order();
        Map<Product,Integer>products=new HashMap<>();
        products.put(product1,3);
        products.put(product2,2);
        order.setProducts(products);
        entityManager.persist(order);
         transaction.commit();

         System.out.println("order details");
        Order fetchedOrder=entityManager.find(Order.class,order.getId());
        System.out.println("order id="+order.getId());
        Map<Product,Integer>fetchedProducts= fetchedOrder.getProducts();
        Set<Product> keys= fetchedProducts.keySet();
        for (Product key:keys){
           int quantity= fetchedProducts.get(key);
           System.out.println("product="+key.getId()+" quantity="+quantity);
        }

        emf.close();


    }


}
