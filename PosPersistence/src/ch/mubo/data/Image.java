package ch.mubo.data;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import ch.mubo.api.EntityObject;
import ch.mubo.api.EntityPlugin;

/**
 * Entity implementation class for Entity: {@link Image}
 *
 * @author www.mubo.ch
 */
@Entity(name = "IMAGE")
@EntityListeners(EntityPlugin.class)
public class Image implements EntityObject {

	@Id
	@Column(name = "ID")
	private String id;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(length = 16777215, nullable = false)
	private Blob imageBlob;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getImageBlob() {
		return this.imageBlob;
	}

	public void setImageBlob(Blob imageBlob) {
		this.imageBlob = imageBlob;
	}
}
