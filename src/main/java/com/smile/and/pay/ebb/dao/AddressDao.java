package com.smile.and.pay.ebb.dao;

import com.smile.and.pay.ebb.models.Address;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Repository
@Transactional
@NoArgsConstructor
public class AddressDao {

    /*@Autowired
    private SessionFactory sessionFactory;

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Address address) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.createSQLQuery("INSERT INTO Address(number, street, zip_code) VALUES(:number, :street, :zip_code)")
                    .setParameter("number", address.getNumber())
                    .setParameter("street", address.getStreet())
                    .setParameter("zip_code", address.getZip_code())
                    .executeUpdate();
            session.flush();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(Objects.nonNull(transaction)){
                transaction.rollback();
            }
        }
    }

    public Address findById(int id) {
        Address address = null;
        try (Session session = this.sessionFactory.openSession()) {
            List<Address> result = session.createQuery("FROM Address M WHERE M.id = :addressId")
                    .setParameter("addressId", id)
                    .list();
            if (!CollectionUtils.isEmpty(result)) {
                address = result.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }

    public List<Address> findAll() {
        try (Session session = this.sessionFactory.openSession()) {
            return session.createQuery("FROM Address", Address.class).list();
        }
    }

    public void update(Address address, int addressId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            Address _address = findById(addressId);
            if(Objects.nonNull(_address)) {
                transaction = session.beginTransaction();
                session.createQuery("UPDATE Address SET number=:number, street=:street, zip_code=:zip_code WHERE id=:id")
                        .setParameter("number", address.getNumber())
                        .setParameter("street", address.getStreet())
                        .setParameter("zip_code", address.getZip_code())
                        .setParameter("id", addressId)
                        .executeUpdate();
                session.flush();
                transaction.commit();
            }
        } catch (Exception e) {
            if(Objects.nonNull(transaction)){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void delete(int addressId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM Address WHERE id=:addressId")
                    .setParameter("addressId", addressId)
                    .executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if(Objects.nonNull(transaction)){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }*/
}
