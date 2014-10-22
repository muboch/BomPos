
package ch.mubo.pos.persistence.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class GenericDao implements Dao {

  @PersistenceContext
  private EntityManager em;

  @Override
  public <T> T create(T t) {
    em.persist(t);
    em.flush();
    em.refresh(t);
    return t;
  }

  @Override
  public void remove(Class<?> type, Integer id) {
    Object ref = em.getReference(type, id);
    em.remove(ref);
  }

  @Override
  public <T> T update(T t) {
    return em.merge(t);
  }

  @Override
  public <T> T find(Class<T> type, Object id) {
    return em.find(type, id);
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> List<T> findWithNamedQuery(String namedQueryName) {
    return em.createNamedQuery(namedQueryName).getResultList();
  }

  @Override
  public int updateWithNamedQuery(String namedQueryName, Map<String, Object> parameters) {
    Query query = em.createNamedQuery(namedQueryName);
    for (Entry<String, Object> entry : parameters.entrySet()) {
      query.setParameter(entry.getKey(), entry.getValue());
    }
    return query.executeUpdate();
  }

  @Override
  public <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters) {
    int resultLimit = 0;
    // if (isSearchGui(namedQueryName)) {
    // resultLimit = JpaConsts.RESULT_LIMIT;
    // }
    return findWithNamedQuery(namedQueryName, parameters, 0, resultLimit);
  }

  // private boolean isSearchGui(String namedQueryName) {
  // return namedQueryName.endsWith(JpaConsts.WITH_FILTER);
  // }

  @Override
  @SuppressWarnings("unchecked")
  public <T> List<T> findWithNamedQuery(String queryName, int firstResult, int resultLimit) {
    return em.createNamedQuery(queryName).setFirstResult(firstResult).setMaxResults(resultLimit).getResultList();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters, int firstResult, int resultLimit) {
    Query query = em.createNamedQuery(namedQueryName);
    query.setFirstResult(firstResult);
    if (resultLimit > 0) {
      query.setMaxResults(resultLimit);
    }
    for (Entry<String, Object> entry : parameters.entrySet()) {
      query.setParameter(entry.getKey(), entry.getValue());
    }
    return query.getResultList();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T findFirstWithNamedQuery(String namedQueryName) {
    return (T)em.createNamedQuery(namedQueryName).setMaxResults(1).getSingleResult();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T queryWithNamedQuery(String namedQueryName, Map<String, Object> parameters) {
    Query query = em.createNamedQuery(namedQueryName);
    for (Entry<String, Object> entry : parameters.entrySet()) {
      query.setParameter(entry.getKey(), entry.getValue());
    }
    return (T)query.getSingleResult();
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> List<T> findByNativeQuery(String sql, Class<T> type) {
    return em.createNativeQuery(sql, type).getResultList();
  }
}
