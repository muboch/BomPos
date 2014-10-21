package ch.mubo.pos.persistence.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import ch.mubo.pos.persistence.api.EntityObject;
import ch.mubo.pos.persistence.api.EntityPlugin;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity(name = "CATEGORY")
@EntityListeners(EntityPlugin.class)
public class Category implements EntityObject {

	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "NAME")
	private String name;
	
	//// TODO: @OneToMany(mappedBy = "category") 
	private Set<Product> products = new HashSet();

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> children) {
		this.products = children;
	}

}
