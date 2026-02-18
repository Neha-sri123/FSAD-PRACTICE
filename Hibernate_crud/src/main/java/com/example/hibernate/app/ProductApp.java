package com.example.hibernate.app;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.example.hibernate.entity.Product;
import com.example.hibernate.util.HibernateUtil;


public class ProductApp {


public static void main(String[] args) {


// INSERT
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session.beginTransaction();


Product p1 = new Product("Laptop", "Dell Inspiron", 60000, 10);
Product p2 = new Product("Mouse", "Wireless Mouse", 500, 50);


session.save(p1);
session.save(p2);
tx.commit();
session.close();


// RETRIEVE
session = HibernateUtil.getSessionFactory().openSession();
Product product = session.get(Product.class, 1);
System.out.println("Retrieved: " + product.getName());
session.close();


// UPDATE
session = HibernateUtil.getSessionFactory().openSession();
tx = session.beginTransaction();
product.setPrice(58000);
session.update(product);
tx.commit();
session.close();



session = HibernateUtil.getSessionFactory().openSession();
tx = session.beginTransaction();
Product deleteProduct = session.get(Product.class, 2);
session.delete(deleteProduct);
tx.commit();
session.close();


HibernateUtil.getSessionFactory().close();
}
}