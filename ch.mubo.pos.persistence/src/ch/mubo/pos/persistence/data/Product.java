/**
 * File Name: Products.java
 * 
 */

package ch.mubo.pos.persistence.data;

import java.util.HashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ch.mubo.pos.persistence.api.EntityObject;
import ch.mubo.pos.persistence.api.EntityPlugin;

/**
 * Entity implementation class for Entity: {@link Product}
 *
 * @author www.mubo.ch
 */
@Entity(name = "PRODUCT")
@EntityListeners(EntityPlugin.class)
public class Product implements EntityObject {

	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICEBUY")
	private Double priceBuy;
	@Column(name = "PRICESELL")
	private Double priceSell;
	@Column(name = "VOLUME")
	private Double volume;
	@Column(name = "ONSTOCK")
	private Boolean inStock;
	@Column(name = "UNITS")
	private Double units;
	@Column(name = "UNITTYPE")
	private String unitType;

	@ManyToOne(cascade = { CascadeType.ALL })
	private Image image;
	// TODO: OneToMany(mappedBy="product")
	private Set<ProductEan> ean = new HashSet();

	@Column(name = "category")
	private Category category;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Image getImage() {
		return this.image;
	}
	  public Set<ProductEan> getEan()
	  {
	    return this.ean;
	  }
	  
	  public void setEan(Set<ProductEan> ean)
	  {
	    this.ean = ean;
	  }
}
