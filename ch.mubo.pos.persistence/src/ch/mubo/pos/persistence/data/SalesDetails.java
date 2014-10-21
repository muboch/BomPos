/**
 * File Name: SalesDetail.java
 * 
 */

package ch.mubo.pos.persistence.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import ch.mubo.pos.persistence.api.EntityObject;

/**
 * TD2:www.mubo.ch Auto-generated comment for class
 *
 * @author www.mubo.ch
 */
@Entity
public class SalesDetails implements EntityObject {

	@Id
	@Column(name = "ID")
	private String id;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
