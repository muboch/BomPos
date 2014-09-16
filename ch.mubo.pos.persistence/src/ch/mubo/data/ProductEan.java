package ch.mubo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ch.mubo.api.EntityObject;
import ch.mubo.api.EntityPlugin;

/**
 * Entity implementation class for Entity: {@link Product}
 *
 * @author www.mubo.ch
 */
@Entity(name = "PRODUCTEAN")
@Table(name = "PRODUCTEAN", indexes = { @Index(name = "EAN_IDX", columnList = "EAN") })
@EntityListeners(EntityPlugin.class)
public class ProductEan implements EntityObject {

	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "EAN")
	private String ean;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Product product;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
