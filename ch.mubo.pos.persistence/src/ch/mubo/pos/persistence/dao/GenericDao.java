package ch.mubo.pos.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDao implements Dao {

    @PersistenceContext
    private EntityManager em;

    public <T> T update(T t) {
	return em.merge(t);
    }

}
