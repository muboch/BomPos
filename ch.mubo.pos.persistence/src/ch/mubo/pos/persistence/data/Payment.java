package ch.mubo.pos.persistence.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import ch.mubo.pos.persistence.api.EntityObject;

@Entity
public class Payment implements EntityObject {
	
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
