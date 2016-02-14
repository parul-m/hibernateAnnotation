
import dto.javabean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HIbernateclass {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        javabean obj = new javabean(101, "vidhi", 34000);
        s.save(obj);
        t.commit();
        s.close();    
    }
}
