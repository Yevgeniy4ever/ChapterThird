package hibernateuserguide;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;


/**
 * Created by Developer on 7/5/2017.
 */
public class Event {

    SessionFactory sessionFactory;
    String content;
    Date date;

    Event(){

    }

    public Event(String s, Date date) {
        this.content = s;
        this.date = date;
    }

    public static void main(String[] args) {
        Event event = new Event();

        try {
            event.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }

        event.ses();

    }



    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }


    }

    void ses(){

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save( new Event( "Our very first event!", new Date() ) );
        session.save( new Event( "A follow up event", new Date() ) );
        session.getTransaction().commit();
        session.close();
    }
}
