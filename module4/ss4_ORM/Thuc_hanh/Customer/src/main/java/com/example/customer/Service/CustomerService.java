package com.example.customer.Service;

import com.example.customer.model.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Service

public class CustomerService implements ICustomerService {


    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
      sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
      entityManager = sessionFactory.createEntityManager();
    }


        @Override
    public List<Customer> findAll() {
        String hql = "SELECT c FROM Customer  AS c";
        TypedQuery<Customer> typedQuery = entityManager.createQuery(hql,Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public Customer findOne(int id) {
        String hql = "select c from Customer as c where c.id = :id";
        TypedQuery<Customer> typedQuery = entityManager.createQuery(hql, Customer.class);
        typedQuery.setParameter("id",id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void save(Customer customer) {
            Session session = null;
            Transaction transaction = null;
            try {
                session = sessionFactory.openSession();
                transaction = session.beginTransaction();
                if (customer.getId() == null){
                    session.save(customer);
                    transaction.commit();

                }else {
                    Customer c = findOne(customer.getId());
                    c.setAddress(customer.getAddress());
                    c.setEmail(customer.getEmail());
                    c.setName(customer.getName());
                    session.update(c);
                    transaction.commit();
                }
            }catch (Exception e){
                e.printStackTrace();
                transaction.rollback();
            }finally {
                if (session != null){
                session.close();
            }
        }
        }

    @Override
    public void delete(int id) {
        Session session = null;
        Transaction transaction = null;
        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Customer customer = findOne(id);
            session.delete(customer);
            transaction.commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }

    }

}
