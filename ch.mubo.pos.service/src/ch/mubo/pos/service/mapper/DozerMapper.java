
package ch.mubo.pos.service.mapper;

import java.util.Collection;
import java.util.List;

import org.dozer.Mapper;
import org.dozer.MappingException;

public interface DozerMapper extends Mapper {

  <T, V> List<V> map(Collection<T> source, Class<V> targetClass) throws MappingException;
}
