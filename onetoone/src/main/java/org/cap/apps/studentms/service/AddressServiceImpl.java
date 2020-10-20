package org.cap.apps.studentms.service;

import org.cap.apps.studentms.dao.AddressDaoImpl;
import org.cap.apps.studentms.dao.IAddressDao;
import org.cap.apps.studentms.entities.Address;
import org.cap.apps.studentms.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AddressServiceImpl implements IAddressService {
    private IAddressDao addressDao;

    private EntityManager entityManager;

    public AddressServiceImpl() {
        JpaUtil jpaUtil = JpaUtil.getInstance();
        entityManager=jpaUtil.getEntityManager();
        addressDao = new AddressDaoImpl(entityManager);

    }

    @Override
    public Address save(Address address) {
       EntityTransaction transaction=entityManager.getTransaction();
       transaction.begin();
       address=addressDao.save(address);
       transaction.commit();
       return address;
    }
}
