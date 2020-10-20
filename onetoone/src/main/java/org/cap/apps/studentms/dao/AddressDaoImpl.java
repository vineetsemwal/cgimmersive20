package org.cap.apps.studentms.dao;

import org.cap.apps.studentms.entities.Address;

import javax.persistence.EntityManager;

public class AddressDaoImpl implements IAddressDao{
    private EntityManager entityManager;

    public AddressDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }
}
