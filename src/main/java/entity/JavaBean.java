package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class JavaBean {

    @PersistenceContext(unitName = "default")
    EntityManager em;

    public List<Books> findAll(){
        List<Books> books=em.createQuery("SELECT book from Books book").getResultList();
        return books;
    }

}
