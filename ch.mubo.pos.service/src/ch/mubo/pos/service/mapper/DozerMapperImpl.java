package ch.mubo.pos.service.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.Mapper;
import org.dozer.MappingException;

public class DozerMapperImpl implements DozerMapper {

    private Mapper delegate;

    public DozerMapperImpl(Mapper delegate) {
	this.delegate = delegate;
    }

    @Override
    public <T> T map(Object source, Class<T> destinationClass) throws MappingException {
	return this.delegate.map(source, destinationClass);
    }

    @Override
    public void map(Object source, Object destinationClass) throws MappingException {
	this.delegate.map(source, destinationClass);
    }

    @Override
    public <T> T map(Object source, Class<T> destinationClass, String mapId) throws MappingException {
	return this.delegate.map(source, destinationClass, mapId);
    }

    @Override
    public void map(Object source, Object destinationClass, String mapId) throws MappingException {
	this.delegate.map(source, destinationClass, mapId);
    }

    @Override
    public <T, V> List<V> map(Collection<T> source, Class<V> targetClass) throws MappingException {
	List<V> target = new ArrayList<V>();
	for (T s : source) {
	    target.add(this.delegate.map(s, targetClass));
	}
	return target;
    }
}
