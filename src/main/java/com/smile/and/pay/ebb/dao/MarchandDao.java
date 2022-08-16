package com.smile.and.pay.ebb.dao;

import com.smile.and.pay.ebb.models.Marchand;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;


@Repository
@Transactional
@NoArgsConstructor
public class MarchandDao {

    /*@Autowired
    private SessionFactory sessionFactory;

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Marchand marchand) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.createSQLQuery("INSERT INTO Marchand(create_date, name, lastname, birthdate) VALUES(:create_date, :name, :lastname, :birthdate)")
                    .setParameter("create_date", marchand.getCreate_date())
                    .setParameter("name", marchand.getName())
                    .setParameter("lastname", marchand.getLastname())
                    .setParameter("birthdate", marchand.getBirthdate())
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

    public Marchand findById(int id) {
        Marchand marchand = null;
        try (Session session = this.sessionFactory.openSession()) {
            List<Marchand> result = session.createQuery("FROM Marchand M WHERE M.id = :marchandId")
                    .setParameter("marchandId", id)
                    .list();
            if (!CollectionUtils.isEmpty(result)) {
                marchand = result.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return marchand;
    }

    public List<Marchand> findAll() {
        try (Session session = this.sessionFactory.openSession()) {
            return session.createQuery("FROM Marchand", Marchand.class).list();
        }
    }

    public void update(Marchand marchand, int marchandId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            Marchand _marchand = findById(marchandId);
            if(Objects.nonNull(_marchand)) {
                transaction = session.beginTransaction();
                session.createQuery("UPDATE Marchand SET create_date=:create_date, name=:name, lastname=:lastname, birthdate=:birthdate WHERE id=:id")
                        .setParameter("create_date", marchand.getCreate_date())
                        .setParameter("name", marchand.getName())
                        .setParameter("lastname", marchand.getLastname())
                        .setParameter("birthdate", marchand.getBirthdate())
                        .setParameter("id", marchandId)
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

    public void delete(int marchandId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM Marchand WHERE id=:marchandId")
                    .setParameter("marchandId", marchandId)
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
