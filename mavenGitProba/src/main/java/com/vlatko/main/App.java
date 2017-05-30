package com.vlatko.main;

import org.hibernate.Session;

import com.vlatko.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       
        Session session = HibernateUtil.getSession();
      //  session.beginTransaction();
       
        User user1 = new User();
        user1.setUsername("hello1234");
        user1.setPassword("world");
        session.save(user1);
        
      //  session.getTransaction().commit();
        session.close();
    }
}
