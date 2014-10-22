
package ch.mubo.pos.persistence.dao;

import java.util.List;
import java.util.Map;

public interface Dao {

  <T> T create(T t);

  void remove(Class<?> type, Integer id);

  <T> T update(T t);

  <T> T find(Class<T> type, Object id);

  <T> List<T> findWithNamedQuery(String namedQueryName);

  <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters);

  <T> List<T> findWithNamedQuery(String queryName, int firstResult, int resultLimit);

  <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters, int firstResult, int resultLimit);

  <T> T findFirstWithNamedQuery(String namedQueryName);

  <T> T queryWithNamedQuery(String namedQueryName, Map<String, Object> parameters);

  <T> List<T> findByNativeQuery(String sql, Class<T> type);

  int updateWithNamedQuery(String namedQueryName, Map<String, Object> parameters);

}
