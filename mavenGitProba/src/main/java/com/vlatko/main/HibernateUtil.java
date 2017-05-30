package com.vlatko.main;


import com.vlatko.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static Session session;
    public  static SessionFactory sessionFactory;

  
    public static Session getSession() {
        
        if(session == null){       
        
        Configuration c = new Configuration()
                .addPackage("com.vlatko.main")
                .addPackage("com.vlatko.model")
                 .addAnnotatedClass(User.class);
        c.configure();
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
        sessionFactory =  c.buildSessionFactory(sr);
        session = sessionFactory.openSession();        
        }        
        return session;
    }
}
