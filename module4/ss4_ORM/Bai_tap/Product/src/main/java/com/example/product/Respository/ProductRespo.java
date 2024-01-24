package com.example.product.Respository;

import com.example.product.Model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Service

public class ProductRespo implements IProductRespo {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
        entityManager = sessionFactory.createEntityManager();
    }

    @Override
    public List<Product> findAll() {
        String hql = "select p from Product as p";
        TypedQuery<Product> typedQuery = entityManager.createQuery(hql,Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Product product) {
        Session session = null;
        Transaction transaction = null;
        try{
        session = sessionFactory.openSession(); // mo phien lam viec session tu sessionFactory
        transaction = session.beginTransaction(); // transaction moi thay doi den db se hoat dong trong pham bi nay
        if(product.getId() == null){
        session.save(product);
        transaction.commit(); // xac nhan mot giao dich
        }else {
            Product product1 = findOne(product.getId());
            product1.setDescription(product.getDescription());
            product1.setManufacture(product.getManufacture());
            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            session.update(product1);
            transaction.commit();
        }
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        finally {
        if(session != null){
        session.close();
        }
        }
    }

    @Override
    public Product findOne(int id) {
    String hql = "select p from Product as p where p.id = : id ";
    TypedQuery<Product> typedQuery = entityManager.createQuery(hql, Product.class);
    typedQuery.setParameter("id",id);
    return typedQuery.getSingleResult();
    }

    @Override
    public void delete(int id) {
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Product product = findOne(id);
            session.delete(product);
            transaction.commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
