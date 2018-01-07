package com.maven.HIBERNATE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Professor p = null;/*= new Professor();
        p.setRno(323644);
        p.setSname("ZALEzvx444Escscufjv.L KHAN");
        p.setSubject("BC;xCc444OssdcM PHYSICS");
        */
        System.out.println("sam");
        
        //p.toString();
        
       /* Configuration con = new Configuration().configure(Should mention configuration file).addAnnotatedClass(Professor.class);
        //@SuppressWarnings("deprecation")
        //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession(s);
        Transaction tr = session.beginTransaction();
        session.save(p);
        tr.commit();*/
        
        
        Configuration con1 = new Configuration().configure().addAnnotatedClass(Professor.class);
        SessionFactory sf1 =con1.buildSessionFactory();
        Session session1 =sf1.openSession();
        Transaction tr1 = session1.beginTransaction();
        
        p= session1.get(Professor.class, 32);
        System.out.println("  1st level cache");
        System.out.println( p );
        p = session1.get(Professor.class,32);
        tr1.commit();
        System.out.println( p );
    }
}
