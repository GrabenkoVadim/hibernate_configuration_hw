package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory instance = initSessionFactory();

    private static org.hibernate.SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }
    public static org.hibernate.SessionFactory getSessionFactory() {
        return instance;
    }
}
