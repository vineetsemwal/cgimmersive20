package org.cap.apps.studentms.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

/**
 * singleton class , only one instance of this class exits
 * constructor is private so if anyone needs instance of this. use getInstance() method
 */
public class JpaUtil {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("schoolms");

    private EntityManager entityManager;

    private JpaUtil() {

    }

    private static JpaUtil instance = new JpaUtil();

    public static JpaUtil getInstance() {
        return instance;
    }

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }

    public void close() {
        entityManager.close();
        emf.close();
    }

}


