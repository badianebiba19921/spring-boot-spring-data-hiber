package com.smile.and.pay.ebb.dao;

import com.smile.and.pay.ebb.models.Product;
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
public class ProductDao {

    /*@Autowired
    private SessionFactory sessionFactory;

    public void save(Product product) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.getTransaction();
            transaction.begin();
            session.createSQLQuery("INSERT INTO Product(create_date, label, unit_price, currency, weight, height) VALUES(:create_date, :label, :unit_price, :currency, :weight, :height)")
                    .setParameter("create_date", product.getCreate_date())
                    .setParameter("label", product.getLabel())
                    .setParameter("unit_price", product.getUnit_price())
                    .setParameter("currency", product.getCurrency())
                    .setParameter("weight", product.getWeight())
                    .setParameter("height", product.getHeight())
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

    public Product findById(int id) {
        Product product = null;
        try (Session session = this.sessionFactory.openSession()) {
            List<Product> result = session.createQuery("FROM Product WHERE id = :productId")
                    .setParameter("productId", id)
                    .list();
            if (!CollectionUtils.isEmpty(result)) {
                product = result.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public List<Product> findAll() {
        try (Session session = this.sessionFactory.openSession()) {
            return session.createQuery("FROM Product", Product.class).list();
        }
    }

    public void update(Product product, int productId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            Product _product = findById(productId);
            if(Objects.nonNull(_product)) {
                transaction = session.beginTransaction();
                session.createQuery("UPDATE Product SET create_date=:create_date, label=:label, unit_price=:unit_price, currency=:currency, weight=:weight, height=:height WHERE id=:id")
                        .setParameter("create_date", product.getCreate_date())
                        .setParameter("label", product.getLabel())
                        .setParameter("unit_price", product.getUnit_price())
                        .setParameter("currency", product.getCurrency())
                        .setParameter("weight", product.getWeight())
                        .setParameter("height", product.getHeight())
                        .setParameter("id", productId)
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

    public void delete(int productId) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM Product WHERE id=:productId")
                    .setParameter("productId", productId)
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
